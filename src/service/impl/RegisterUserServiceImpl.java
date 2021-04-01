package service.impl;

import java.util.ArrayList;

import model.Post;
import model.users.*;
import service.IRegisterUserService;
import service.MainService;

public class RegisterUserServiceImpl extends GuestUserServiceImpl implements IRegisterUserService {

	@Override
	public RegisterUser signIn(String username, String password) throws Exception {		
		for (GuestUser gUser : MainService.allUsersInSystem) {
			if (gUser instanceof RegisterUser) {
				RegisterUser tempUser = (RegisterUser)gUser;
				if (tempUser.getUsername().equals(username) && tempUser.getPassword().equals(password)) {
					return tempUser;
				}
			}
		}
		throw new Exception("Lietotaajvaards un/vai parole nav pareiza");
	}

	@Override
	public ArrayList<Post> searchInPrivatePosts(String searchedWord) {
		ArrayList<Post> resultPosts = new ArrayList<>();

		for (GuestUser gUser : MainService.allUsersInSystem) {
			if (gUser instanceof PrivateUser) {
				PrivateUser tempUser = (PrivateUser)gUser;
				for (Post pPost : tempUser.getPrivatePosts()) {
					if (pPost.getMsg().contains(searchedWord) || pPost.getTitle().contains(searchedWord)) {
						resultPosts.add(pPost);
					}
				}
			}
		}
		return resultPosts;
	}

	@Override
	public ArrayList<PrivateUser> searchPrivateUsers(String searchedWord) {
		ArrayList<PrivateUser> resultUsers = new ArrayList<>();

		for (GuestUser gUser : MainService.allUsersInSystem) {
			if (gUser instanceof PrivateUser) {
				if (((PrivateUser) gUser).getNameAndSurname().contains(searchedWord)) {
					resultUsers.add((PrivateUser)gUser);
				}
			}
		}
		return resultUsers;
	}
	
}
