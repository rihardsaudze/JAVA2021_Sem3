package model.users;

import java.util.ArrayList;

public class Page {
	private long pa_ID;
	private static long counter = 0;
	private String title;
	private String description;
	private ArrayList<Post> allPostsInPage = new ArrayList<>();
	private ArrayList<RegisterUser> followers = new ArrayList<>();
	
	public long getPa_ID() {
		return pa_ID;
	}
	
	public void setPa_ID() {
		this.pa_ID = counter++;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public ArrayList<Post> getAllPostsInPage() {
		return allPostsInPage;
	}
	
	public void setAllPostsInPage(ArrayList<Post> allPostsInPage) {
		this.allPostsInPage = allPostsInPage;
	}
	
	public ArrayList<RegisterUser> getFollowers() {
		return followers;
	}
	
	public void setFollowers(ArrayList<RegisterUser> followers) {
		this.followers = followers;
	}

	public Page() {
		setPa_ID();
		setTitle("");
		setDescription("");
	}

	public Page(long pa_ID, String title, String description) {
		setPa_ID();
		setTitle(title);
		setDescription(description);
	}

	@Override
	public String toString() {
		String res =  title + ": ";
		for (Post p: allPostsInPage) {
			res += p.toString();
			
		}
		return res + ": followers " + followers.size();
	}
	
}
