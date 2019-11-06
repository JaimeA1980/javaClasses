package com.class14;

public class SplitMethod {

	public static void main(String[] args) {

		/*
		 * .split This method splits this string around matches of the given regular
		 * expression.
		 */

		// split the following string into array of strings/work

		String str = "Video provides a powerful way to help you prove your point";

		String[] array = str.split(" ");

		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
System.out.println("=========================================================================================================================================================================");
		// How can we find how many sentences are in the following string;

		String str1 = "Today is Sunday. It's a sunny day. And We are having java class.";

		String[] array2 = str1.split("\\.");  // there are double back slashes because . is not recognized without them
		System.out.println("The number of sentences in the given String is:: "+array2.length);
		
		for (String string : array2) {
			System.out.println(string.trim());
		}

	}
}
