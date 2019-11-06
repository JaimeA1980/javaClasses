package com.class14;

public class ClassTask1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//1)
		String sent="How's it goin?";
		
		System.out.println(sent.replace(" ", ""));
		System.out.println("=================================================================================================================================================================");
		
//2)
		String combo="H1e2l3p&*";
		String replace=combo.replaceAll("[^a-zA-Z]", "");
		System.out.println(replace);
		System.out.println(replace.length());
		
		
		
		
		
System.out.println("=========================================================================================================================================================================");		
//3)
		String a = "Is it Saturday? Is it raining? Do we have Java Class today?";
		
		String[] array2 = a.split("\\?");
		System.out.println(array2.length);
		
		

	}

}
