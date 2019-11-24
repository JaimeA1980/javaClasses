package com.class24;

public class ThisWithConstructor {
	
	public ThisWithConstructor() {
		System.out.println("I am a non argument constructor");
	}
	
	ThisWithConstructor(String str){
		this();//used to call current class constructor
		System.out.println("I am constructor with 1 String parameter");
	}
	
	ThisWithConstructor(String str, String str1){
		this("Help");//always MUST be a first statement
		//this(); in this case it is second statement, will get error
		System.out.println("I am a constructor with 2 params");
	}
	
	public static void main(String[] args) {
		
		ThisWithConstructor obj = new ThisWithConstructor("Hello");
		//can we execute two constructors when creating an object(or at the same time)
		//yes -  it can be achieved using this()
		// this type of constructor calls (OR CALLING) is known as CONSTRUCTOR CHAINING
		System.out.println("======================================================================================================================================================================");
		ThisWithConstructor obj1 = new ThisWithConstructor("Hello", "Bye");
		
		
				
	}

}
