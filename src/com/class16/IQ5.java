package com.class16;

public class IQ5 {
	public static void main(String[] args) {
		/*
		 * Write a java program to reverse String? Reverse a string word by word
		 */

		String given = "Welcome to the Java class";

		/*
		 * to reverse String split(); Step 1: split--> array of String Step 2: use for
		 * loop and use decrement
		 */
		// solution for second part of task, Reverser a string word by word
		String reversed = "";
		String[] str = given.split("\\s");
		for (int j = str.length - 1; j >= 0; j--) {
			reversed = reversed + str[j] + " ";
		}
		System.out.println(reversed);
		// Write a java program to reverse String?
		// toCharArray(); charAt();

		// Maria's way charArray
		String given1 = "Today is Java Class";
		char[] charArray = given1.toCharArray();
		for (int i = charArray.length - 1; i >= 0; i--) {
			System.out.print(charArray[i]);
			
			//Smart girls way, charAt
		}
		System.out.println();
		String word3 = "I love Java";
		for (int i = word3.length() - 1; i >= 0; i--) {
			System.out.print(word3.charAt(i));
		}
	}
}
