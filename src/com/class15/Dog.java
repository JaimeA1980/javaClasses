package com.class15;

public class Dog {
	
	//Create a Dog Class and create 3 different objects of it: Husky, Bulldog, Labrador  with specific attributes and behaviours.


	
	String breed, size;
	
	void bark() {
		System.out.println("The "+breed+" barks to communicate");
	}
	void playful() {
		System.out.println("The "+breed+" is a very playful canine");
	}
	void loyal() {
		System.out.println("The "+breed+" is loyal to its owner");
	}
	
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.breed="Bulldog";
		dog.size="chunky";
		System.out.println(dog.breed+" is a very special fun "+dog.size+" dog!");
		dog.bark();
		dog.playful();
		dog.loyal();
	}
}
