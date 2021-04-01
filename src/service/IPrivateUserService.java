package service;

public interface IPrivateUserService {
	public void addNewPrivatePost(String msg, String title);
	public void addNewPublicPost(String msg, String title);
	public boolean addFollower(String followerUserName);
}
