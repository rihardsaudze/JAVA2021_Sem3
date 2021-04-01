package model.users;

import java.util.ArrayList;

import model.Post;

public class PrivateUser extends RegisterUser {
	private long p_ID;
	private static long counter = 0;
	private ArrayList<Post> privatePosts = new ArrayList<>();
	private ArrayList<Post> publicPosts = new ArrayList<>();
	private ArrayList<RegisterUser> followers = new ArrayList<>();
	private String nameAndSurname;
	
	
	//getters and setters
	public String getNameAndSurname() {
		return nameAndSurname;
	}

	public void setNameAndSurname(String nameAndSurname) {
		this.nameAndSurname = nameAndSurname;
	}	
	
	public long getP_ID() {
		return p_ID;
	}
	
	public void setP_ID() {
		this.p_ID = counter++;
	}
	
	public static long getCounter() {
		return counter;
	}
	
	public static void setCounter(long counter) {
		PrivateUser.counter = counter;
	}
	
	public ArrayList<Post> getPrivatePosts() {
		return privatePosts;
	}
	
	public void setPrivatePosts(ArrayList<Post> privatePosts) {
		if (privatePosts != null) {
			this.privatePosts = privatePosts;
		} else {
			this.privatePosts = new ArrayList<>();
		}
	}
	
	public ArrayList<Post> getPublicPosts() {
		return publicPosts;
	}
	
	public void setPublicPosts(ArrayList<Post> publicPosts) {
		if (publicPosts != null) {
			this.publicPosts = publicPosts;
		} else {
			this.publicPosts = new ArrayList<>();
		}
	}
	
	public ArrayList<RegisterUser> getFollowers() {
		return followers;
	}
	
	public void setFollowers(ArrayList<RegisterUser> followers) {
		if (followers != null) {
			this.followers = followers;
		} else {
			this.followers = new ArrayList<>();
		}
	}
	
	//constructors
	public PrivateUser() {
		super();
		nameAndSurname = "";
		setP_ID();
	}
	
	public PrivateUser(String username, String password, String nameAndSurname) {
		super(username, password);
		setNameAndSurname(nameAndSurname);
		setP_ID();
	}
	
	//toString
	@Override
	public String toString() {
		return nameAndSurname + ": public posts " + publicPosts.size() + ", private posts " + privatePosts.size() + ", followers" + followers.size();
	}
	
	//others
	//9.1. create new private post
	//9.2. create new public post
	//10. add follower
	
}
