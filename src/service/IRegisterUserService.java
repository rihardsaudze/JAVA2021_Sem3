package service;

import java.util.ArrayList;
import model.users.RegisterUser;
import model.Post;
import model.users.*;

public interface IRegisterUserService {
	public RegisterUser signIn(String username, String password) throws Exception;
	public ArrayList<Post> searchInPrivatePosts(String searchedWord);
	public ArrayList<PrivateUser> searchPrivateUsers(String searchedWord);
}
