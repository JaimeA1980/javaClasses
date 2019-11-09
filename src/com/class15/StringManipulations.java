package com.class15;

public class StringManipulations {
	public static void main(String[] args) {
		//String class comes in java lang package
		
		//2 ways to create a String
		//1. 
		String str = "Hello";
		//2.
		String str1 = new String("hello");
		System.out.println(str);
		System.out.println(str1);
		//find the number of characters inside the String
		int length=str.length();
		System.out.println(length);
		//case conversion methods/functions
		
		System.out.println(str.toLowerCase()); //hello, but if changed to str=str.toLowerCase();, next line will be lower case
		System.out.println(str); //Hello
		
		//verify if the String is empty
		String myString="";//empty value
		boolean isEmpty=myString.isEmpty();
		System.out.println(isEmpty);
		
		String myString1=null;//no value at all, it is equal to
		//String myString1;
		//System.out.println(myString1.isEmpty());
		
		//how to verify existence of characters in the string
		String a="Good evening students";
		boolean exist=a.contains("student");
		System.out.println(exist);
		
		System.out.println(a.startsWith("Good"));
		System.out.println(a.endsWith("student"));
	}

}
