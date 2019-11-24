package com.class22;

public class StaticVsNonStatic {
	
	//template for a students (school, name, grade)
	
	static String school = "Syntax";
	String name;
	char grade;
	//instance method, non static
	void getInfo() {
		System.out.println("My name is "+name+" and I am going to "+school+" and my grade is "+grade);
	}//static method
	static void getInfo1() { //nont static variables cannot be added to static method
		System.out.println("I am attending classes at "+school);
		//System.out.println("My name is "+name);
		/*compiler will give an error
		 * you CANNOT access NON static members within STATIC methods
		 */
	}
	
	public static void main(String[] args) {
		/*accessing static members within same class
		 * -->just use name for a variable
		 * or call method by its name only
		 */
		System.out.println(school);
		getInfo1();
		
		//to access instance variables or method you will need to create an object even if in the same class
		
	}
}
