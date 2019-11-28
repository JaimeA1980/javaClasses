package com.class25_1;
//Create 1 class with a static method that has 3 overloaded forms. 
//Then call each overloaded method with specific arguments and observe result.

public class OverloadedFormsTask {
	
	static void forms() {
		System.out.println("First overloaded method form");
	}
	static void forms(int num) {
		System.out.println("Second overloaded method form ");
	}
	static void forms(String str, int  num) {
		System.out.println("Third overloaded method form");
	}
	
	public static void main(String[] args) {
		OverloadedFormsTask.forms();
		OverloadedFormsTask.forms(2);
		OverloadedFormsTask.forms("Hello", 5);
	}
	
	
	

}
