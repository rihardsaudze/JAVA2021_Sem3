package service;

import java.util.ArrayList;
import model.users.RegisterUser;
import model.users.BusinessUser;
import model.users.Page;
import model.users.Post;

public interface IGuestUserService {
	//1. Register
	public RegisterUser register(String username, String password, String nameOrTitle, boolean isPrivateUser);

	//3. Search public posts
	public ArrayList<Post> searchInPosts(String searchedWord);
	
	//6. Search business user
	public ArrayList<BusinessUser> searchBusinessUser(String searchedWord);
	
	//7. Search pages
	public ArrayList<Page> searchPage(String searchedWord);
}
