package com.class12;

public class ManipulationClassTask1 {
	
	public static void main(String[] args) {
		
		//create two strings and initialize them with some value.
		//implement the following methods on those strings.
		
		/*sen.length();
		 * sen.equals();
		 * sen.contains(s)
		 * sen.toUpperCase();
		 * sen.toLowerCase();
		 * sen.equalsIgnoreCase(anotherString); 
		 */
		
		String name = "Amaris";
		String dad = "Jaime";
		System.out.println(name.length()+dad.length());
		System.out.println(dad.equals(name));
		System.out.println(name.contains(dad));
		System.out.println(dad.toUpperCase());
		System.out.println(name.toLowerCase());
		System.out.println(name.equalsIgnoreCase(dad));
		
		System.out.println("=================================================================================================================================================================");
		
		String str2="It is very hot in the class";
		System.out.println("Is this strings starts with "+str2.startsWith("It"));
		//System.out.println("Is this string starts with "+str2.startsWith("in", 3));
		
		/*
		 * This method tests if this string ends with
		 * the specified suffix
		 */
		System.out.println("Is this string ends with="+str2.endsWith("class"));
		
		
		
	}

	private static String startsWith(String string) {
		// TODO Auto-generated method stub
		return null;
	}

}
