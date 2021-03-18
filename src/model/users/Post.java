package model.users;

import java.util.Date;

public class Post {
	private long po_ID;
	private static long counter = 0;
	private String msg;
	private String title;
	private Date postDateAndTime;
	
	public long getPo_ID() {
		return po_ID;
	}
	
	public void setPo_ID() {
		this.po_ID = counter++;
	}
	
	public String getMsg() {
		return msg;
	}
	
	public void setMsg(String msg) {
		this.msg = msg;		//TODO verification
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public Date getPostDateAndTime() {
		return postDateAndTime;
	}
	
	public void setPostDateAndTime() {
		this.postDateAndTime = new Date();
	}

	public Post() {
		setPo_ID();
		setMsg("");
		setTitle("");
		setPostDateAndTime();
	}
	
	public Post(String msg, String title) {
		setPo_ID();
		setMsg(msg);
		setTitle(title);
		setPostDateAndTime();
	}

	@Override
	public String toString() {
		return po_ID + ": " + title + ". " + msg + ", " + postDateAndTime;
	}
}
