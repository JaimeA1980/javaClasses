package com.class16;

public class IQ6 {

	public static void main(String[] args) {
		/*Write a Java program to find whether a String is a palandrome or not?
		 * if reversed String and original String are same --> string is palindrome
		 * mom, dad, madam, racecar, kayak, bob
		 * Logic:
		 * Step1: reverse the string
		 * Step2: compare 2 Strings:
		 * if strings are equal -> palindrome
		 * else--> not palindrome
		 */
		
		String original="kayak";
		String reversed="";
		//5-1=4
		for (int i=original.length()-1; i>=0; i--) {
			
			reversed=reversed+original.charAt(i);
		}
		System.out.println(reversed);
		
		if (original.equals(reversed)) {
			System.out.println("String is palindrome");
		}else {
			System.out.println("String is NOT palindrome");
		}
	}

}
