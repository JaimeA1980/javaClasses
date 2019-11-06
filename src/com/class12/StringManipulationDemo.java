package com.class12;

public class StringManipulationDemo {

	public static void main(String[] args) {
		
		// There are two ways to create String objects.
		
		//1. String Literal
		String name="John"; //this is an actual array, each character stored in an index
		System.out.println(name);
		System.out.println("The length of name is "+name.length());
		
		//2.Creating string with new key word
		String name1=new String("John1");
		System.out.println(name1);
 
		/*
		 * This method returns the length of this string;
		 * the length is equal to the number
		 * of 16-bit Unicode characters in the string.		 * 
		 */
		
		int name1Len=name1.length();
		System.out.println("The length of name1 is "+name1Len);
		System.out.println("_________________________________________________________________________________________________________________________________________________________________");
		
		
		String str1="HelLo WoRld";
		System.out.println("Before: "+str1);
		
		str1 = str1.toLowerCase();
		System.out.println("After: "+str1);
		
		// .equals method
		
		String str2="HElLo WoRld";
		
		boolean isEqual=str1.equals(str2);
		System.out.println(isEqual);
		
		//.equalsIgnoreCase();
		//This method does not care for capitalization and 
		//compare the content only
		
		System.out.println(str1.equalsIgnoreCase(str2));
		System.out.println("=================================================================================================================================================================");
		
		/*toUpperCase():
		 * This method converts all of the characters in 
		 * this String to uppercase
		 */
		
		String str3="Mohammad";
		System.out.println("Before ::"+str3);
		str3=str3.toUpperCase();
		System.out.println("After :"+str3);
		
		
		
		
	}

}
