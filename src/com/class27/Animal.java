package com.class27;

public class Animal {
	
	public static void whoAmI() {
		System.out.println("I am an animal");
	}

}
class Monkey extends Animal{
	/*cannot override static methods 
	 * 
	 * when both methods are static within subclass
	 * its called method hiding
	 */
	public static void whoAmI() {
		System.out.println("I am a monkey");
	}
}
