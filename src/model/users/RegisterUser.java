package model.users;

import service.impl.*;

public class RegisterUser extends GuestUser {
	public static RegisterUserServiceImpl registerUserService = new RegisterUserServiceImpl();
	private long r_ID;
	private String username;
	private String password;			//TODO MD5 hashing
	
	private static long counter = 0;
	
	public long getR_ID() {
		return r_ID;
	}

	public void setR_ID() {
		this.r_ID = counter;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String userName) {
		this.username = userName;		//TODO verification
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;		//TODO verification
	}	
	
	public RegisterUser() {
		username = "test";
		password = "test";
		setR_ID();
	}
	
	public RegisterUser(String username, String password) {
		setUsername(username);
		setPassword(password);
		setR_ID();
	}

	@Override
	public String toString() {
		return "RegisterUser [r_ID=" + r_ID + ", username=" + username + "]";
	}	
}
