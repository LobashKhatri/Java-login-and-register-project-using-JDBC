package com.myapp;

public class User {
	private int id;
	private String userPassword;
	private String userEmail;
	private String userName;
	
	
	
	public User(String userName, String userPassword, String userEmail) {
		super();
		this.userPassword = userPassword;
		this.userEmail = userEmail;
		this.userName = userName;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	
	
	
	

}
