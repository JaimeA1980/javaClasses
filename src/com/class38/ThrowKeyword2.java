package com.class38;

public class ThrowKeyword2 {
	public static void main(String[] args) {
		checkAge(15);
	}
	//create a method that will check if user is older than 18
	// if not, then we want to show an exception
	
	public static void checkAge(int age) {
		if(age>=18) {
			System.out.println("You can get a drivers license");
		}else {
			throw new RuntimeException("You must be 18 or older");
		}
	}
}
