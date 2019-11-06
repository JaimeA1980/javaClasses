package com.class12;

public class StringManipulationDemo5 {

	public static void main(String[] args) {
	
		/*
		 * This method returns a copy of the string,
		 * with leading and trailing whitespace omitted
		 * THIS IS TRIMMING!
		 */
		
		String str6=" How are you? ";
		System.out.println(str6.trim());
		
		System.out.println("=================================================================================================================================================================");
		
		/*
		 * this method returns the character located at the String's specified index.
		 * The String indexes start from zero.
		 */
		String str7="We might be done early today";
		System.out.println(str7.charAt(4));
		
		System.out.println("=================================================================================================================================================================");
		
		/*.indexof
		 * This method returns the index within this string of the
		 * first occurrence of the specified character or -1
		 * if the character does not occur
		 */
		
		String str8="We might mnot be done early";
		System.out.println(str8.indexOf('m'));
		System.out.println(str8.indexOf('m', 4));  //if entering 12, it will return -1
		System.out.println(str8.indexOf('z',0));
		
		System.out.println("=================================================================================================================================================================");
		
	}

}
