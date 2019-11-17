package com.class19;

public class Tasks {
	
	String createEmail(String userName, String lastName, String emailType) {
		
		String email = userName +lastName+emailType;
		return email;
	}
public static void main(String[] args) {
	
	Tasks obj =new Tasks();
	String email=obj.createEmail("john", "snow", "@gmail.com");
	System.out.println(email);
	
}
}
