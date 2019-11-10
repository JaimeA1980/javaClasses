package com.class17;

public class Computer {

	String brand, name;
	boolean keyboard;
	int screen, memory, ram;

	// define behavior, actions
	void playGames() {// method header
		// method body
		System.out.println("I can play on my " + name);
	}

	void javaCoding() {
		System.out.println("I can do Java coding on my " + name);
	}

	void watchMovie() {
		System.out.println("I can watch movies on my " + name);
	}
// using main method
	public static void main(String[] args) {

		Computer comp1 = new Computer();
		comp1.brand = "Apple";
		comp1.name = "MacBook Pro";
		comp1.memory = 250;

		System.out.println("I have a "+comp1.brand+" "+comp1.name+" with "+comp1.memory+" GB of memory!");
				comp1.javaCoding();
				comp1.watchMovie();
				
				Computer comp2=new Computer();
				comp2.brand="Dell";
				comp2.name="420";
				comp2.memory=125;
				
				comp2.javaCoding();
				comp2.watchMovie();
				comp2.playGames();
	}

}
