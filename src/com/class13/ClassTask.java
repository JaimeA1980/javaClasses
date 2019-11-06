package com.class13;

public class ClassTask {

	public static void main(String[] args) {

		String day = "Sunday";

		// write in reverse, using code of course

		// System.out.println(day.charAt(5)+day.charAt(4)+day.charAt(3));...to be
		// continued...not the best way to do this

		System.out.println(day.length());

		for (int i = day.length() - 1; i >= 0; i--) {
			System.out.print(day.charAt(i));
		}
		System.out.println(
				"=============================================2nd Task=======================================================");
/*
 * Create a String and if the String is not empty, perform the following:
 * if the String has an odd number of characters
 */
		String str1 = "Hello";
		int length=str1.length();
		int middle=str1.length()/2;
		
		if (!str1.isEmpty()) {
			if (length % 2 != 0 && length>=3) {
				System.out.println(str1.charAt(middle));
			}
		}

	}

}
