package com.class28;

public class UserInfo extends UserClass{
	
	String address;
	
	UserInfo(String name, int mobileNumber, String address){
		super(name,mobileNumber);
		this.address=address;
		
	}
	public void userDetails() {
		System.out.println(name+" "+mobileNumber+" "+address);
	}
	public static void main(String[] args) {
		UserInfo info = new UserInfo("Jaime",2552555, "2801 Adams mill Rd");
		info.userDetails();
	}
	
	
}
