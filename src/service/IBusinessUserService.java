package service;

import model.Page;

public interface IBusinessUserService {
	public void addNewPage(String title);
	public void addNewPostInPage(String postTitle, String postMsg, Page pageTitle);
	public void addNewPostInAllUserPages(String postTitle, String postMsg);
}
