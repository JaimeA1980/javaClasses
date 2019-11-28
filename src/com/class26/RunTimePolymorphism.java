package com.class26;

public class RunTimePolymorphism {
	
	public static void main(String[] args) {
		//widening
		double d=90;
		//narrowing
		int i = (int)1.99;
		
		//Non Primitive Typecasting
		//widening -> creating an object of the class
		//				and giving reference to the Parent class
		Animal obj = new Cat();
		//narrowing
		//Cat obj2 = new Animal(); --> cannot convert from animal to Cat
		obj.eat();// coming from parent, if there is an override in child class, it will take it from there
		obj.sleep();//this method will  come from child class --> runtime polymorphism//
		//obj.meow();compiler error--> method won't available
		
		
		
		
	}

}
