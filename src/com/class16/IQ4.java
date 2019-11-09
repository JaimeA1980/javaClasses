package com.class16;

public class IQ4 {

	public static void main(String[] args) {
		/*
		 * How to find out the part of the string from a String?
		 * What is a substring?
		 * Find number of words in String?
		 */
		
		String str="Today is very cold outside";
		String subString = str.substring(0,5);
		System.out.println(subString);
		/*
		 * Logic:
		 * Step 1: split based on the spaces ---> array of String
		 * Step 2: find the length of an array
		 */
		System.out.println(str);
		String[] words = str.split(" ");
		System.out.println(words.length);
	}

}
