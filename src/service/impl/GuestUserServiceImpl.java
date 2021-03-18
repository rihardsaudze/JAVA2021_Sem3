package service.impl;

import java.util.ArrayList;

import model.users.PrivateUser;
import model.users.BusinessUser;
import model.users.GuestUser;
import model.users.Page;
import model.users.Post;
import model.users.RegisterUser;
import service.IGuestUserService;
import service.MainService;

public class GuestUserServiceImpl implements IGuestUserService {

	@Override
	public RegisterUser register(String username, String password, String nameOrTitle, boolean isPrivateUser) {
		if (isPrivateUser) {
			return new PrivateUser(username, password, nameOrTitle);
		} else {
			return new BusinessUser(username, password, nameOrTitle);
		}
	}

	@Override
	public ArrayList<Post> searchInPosts(String searchedWord) {
		ArrayList<Post> resultPosts = new ArrayList<>();
		
		for (GuestUser user: MainService.allUsersInSystem) {
			//private user posts are stored in publicPosts list
			if (user instanceof PrivateUser) {
				for(Post p: ((PrivateUser) user).getPublicPosts()) {
					if (p.getTitle().contains(searchedWord) || p.getMsg().contains(searchedWord)) {
						resultPosts.add(p);
					}
				}
			} 
			//business user posts are stored in page postList
			else if (user instanceof BusinessUser) {
				for(Page page: ((BusinessUser) user).getAllPages()) {
					for(Post p: page.getAllPostsInPage()) {
						if (p.getTitle().contains(searchedWord) || p.getMsg().contains(searchedWord)) {
							resultPosts.add(p);
						}
					}
				}
			}
		}
		return resultPosts;
	}

	@Override
	public ArrayList<BusinessUser> searchBusinessUser(String searchedWord) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Page> searchPage(String searchedWord) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
