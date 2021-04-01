package service.impl;

import model.Page;
import model.Post;
import model.users.BusinessUser;
import service.IBusinessUserService;

public class BusinessUserServiceImpl extends RegisterUserServiceImpl implements IBusinessUserService {
	
	private BusinessUser bUser;
	
	public BusinessUserServiceImpl(BusinessUser bUser) {
		//TODO verification
		this.bUser = bUser;
	}
	
	@Override
	public void addNewPage(String title) {
		//TODO verification
		Page newPage = new Page(title, title);
		bUser.getAllPages().add(newPage);
		
	}
	
	@Override
	public void addNewPostInPage(String postTitle, String postMsg, Page pageTitle) {
		// TODO Auto-generated method stub
		Post newPost = new Post(postMsg, postTitle);
		for (Page p: bUser.getAllPages()) {
			if (p.getTitle().equals(pageTitle)) {
				p.getAllPostsInPage().add(newPost);
			}
		}
		
	}
	
	@Override
	public void addNewPostInAllUserPages(String postTitle, String postMsg) {
		// TODO Auto-generated method stub
		
	}
}
