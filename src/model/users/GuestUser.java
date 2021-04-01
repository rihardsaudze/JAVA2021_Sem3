package model.users;

import service.impl.*;

public class GuestUser {
	public static GuestUserServiceImpl guestService = new GuestUserServiceImpl();
	private long g_ID;
	
	private static long counter = 0;

	public long getG_ID() {
		return g_ID;
	}

	public void setG_ID() {
		this.g_ID = counter++;
	}
	
	public GuestUser() {
		setG_ID();
	}
	
	@Override
	public String toString() {
		return "" + g_ID;
	}
	
}
