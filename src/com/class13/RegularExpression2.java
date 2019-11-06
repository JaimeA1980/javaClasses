package com.class13;

public class RegularExpression2 {

	public static void main(String[] args) {
		
		String str="Today is our java class";
		
		System.out.println(str.replaceAll(" ", ""));
		System.out.println("****************************************************************************************************************************************************************");
		System.out.println(str.replaceAll("\\s","")); //same as the top execution but with short hand
		
	System.out.println(str.replaceAll("java(.*)", ""));
		
				

	}

}
