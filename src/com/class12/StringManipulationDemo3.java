package com.class12;

public class StringManipulationDemo3 {

	public static void main(String[] args) {
		
		/*This method checks whether a String is emptry or not.
		 * This method returns true if the given String
		 * is empty, else it returs false.
		 */

		String str="";
		System.out.println("Is this string emptry= "+str.isEmpty());
		String str2="Hello";
		System.out.println("Is this string empty= "+str2.isEmpty());
	
//		if(!str.isEmpty()) {
//			System.out.println("This is not empty");
//		}else {
//			System.err.println("This is empty String");
//		}
		
		String sentence="Each \t day has a promise to brighten up the day, \n but first you must allow the sun to come your way";
		System.out.println(sentence);
	}

}
