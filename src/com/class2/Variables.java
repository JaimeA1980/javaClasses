package com.class2;

public class Variables {
 
	public static void main(String[] args) {
		
		String name="Jaime";
		String lastName="Aneiva";
		char studentGrade='A';
		short grade=6;
		String city="Arlington";
		String state="VA";
		long phoneNumber=2026251447;//or 2026251447l
		
		System.out.println(name);
		System.out.println(lastName);
		System.out.println(grade);
		System.out.println(city);
		System.out.println(state);
		System.out.println(phoneNumber);
		System.out.println(studentGrade);
		//String city="Washington DC";// we dno not need to declare variable again
		
		city="DC";
		state="District of Columbia";
		phoneNumber=7033561929l;
		grade=10;
		studentGrade='B';
		System.out.println(city);
		System.out.println(state);
		System.out.println(phoneNumber);
		System.out.println(grade);
		System.out.println(studentGrade);
		
		//my name is __
		//I live in city of ___
		// My phone number is ___
		
		System.out.println("My name is "+name);
		System.out.println("I live in the city of "+city);
		System.out.println("My phone number in "+phoneNumber);
		
		
	}

}
