package com.class13;

public class RegularExpressions {
	public static void main(String[] args) {
		
		String str="14234Hel45645lo465456";
		System.out.println(str.replaceAll("[0-9]",""));//leave only text
		System.out.println(str.replaceAll("[a-zA-Z]","")); //Leave only numbers 142345645465456
		
		
		
		// Remove all except text and numbers
		String str2="Hi#$%How#$%#$4356346";
				System.out.println(str2.replaceAll("[^a-zA-Z0-9]","")); // "^" means not
				System.out.println(str2.replace("How", ""));
				
				
				
				
				
		
		
	}

}
