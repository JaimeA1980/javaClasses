package com.class31;

public class Registration {
	private String email;
	private String userName;
	private String password;
	
	public String getEmail() {
		return email;
	}
	public String getUserName() {
		return userName;
	}
	public String getPassword() {
		return password;
	}
	
	public void setEmail(String email) {
		if (email.endsWith("@gmail.com")) {
			this.email=email;
		} else {
			System.out.println("Not valid email type");
		}
	}
	public void setUserName(String userName) {
		if (userName.length()>6) {
			this.userName=userName;
		} else {
			System.out.println("User name must be at least 7 characters long");
		}
	}
	
	public void setPassword(String password) {
		if(!password.isEmpty()&&!password.contains(userName)&& password.length()>=6 ) {
			System.out.println("Valid");
		}else {
			System.out.println("Password must contain at least 8 character, and cannot contain your username");
		}
	}
}
