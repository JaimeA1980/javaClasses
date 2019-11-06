package com.class12;

public class StringManipulationDemo4 {

	public static void main(String[] args) {
	
		/*
		 * This method appends one String to the end of another.
		 * The method returns a String with the value of the 
		 * String passed in to the method appended to the end
		 * of the String used to invoke this method.
		 */
		
		String str3="Hello ";
		String str4="World ";	//spaces after these two words
		String str5="People";
		
		System.out.println(str4+str3+str5);
		System.out.println(str3.concat(str4).concat(str5));
		
	}

}
