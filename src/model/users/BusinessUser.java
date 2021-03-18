package model.users;

import java.util.ArrayList;

public class BusinessUser extends RegisterUser {
	private long b_ID;
	private static long counter = 0;
	private String organisationTitle;
	private ArrayList<Page> allPages = new ArrayList<>();
	
	public long getB_ID() {
		return b_ID;
	}
	
	public void setB_ID() {
		this.b_ID = counter++;
	}
	
	public String getOrganisationTitle() {
		return organisationTitle;
	}
	
	public void setOrganisationTitle(String organisationTitle) {
		this.organisationTitle = organisationTitle;			//TODO verification
	}
	
	public ArrayList<Page> getAllPages() {
		return allPages;
	}
	
	public void setAllPages(ArrayList<Page> allPages) {
		if (allPages != null) {
			this.allPages = allPages;
		} else {
			this.allPages = new ArrayList<>();
		}
	}
	
	public BusinessUser() {
		super();
		setB_ID();
		setOrganisationTitle("");
	}
	
	public BusinessUser(String username, String password, String organisationTitle) {
		super(username, password);
		setB_ID();
		setOrganisationTitle(organisationTitle);
	}
	
	@Override
	public String toString() {
		return organisationTitle + ": pages " + allPages.size();
	}
	
	//8. create new Page
	//9. create a post in specific page
	//9.1. create a post in all pages
	
}
