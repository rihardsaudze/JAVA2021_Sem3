package model.users;

public class GuestUser {
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
		return "GuestUser [g_ID=" + g_ID + "]";
	}
	
	//1. Register
	
	//3. Search public posts
	
	//6.
	
	//7.
	
}
