package com.class30;

public interface Drivable {
	//public static final variables
	boolean DRIVE_FAST = true;//constant variables are written using all upper case
	
	//public abstract - by default compiler will add public abstract to the methods
	void drive();
}
class Cars{
	public void stop() {
		System.out.println("Car stops by pressing brakes");
	}
}
class Toyota extends Cars implements Drivable{

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("Toyota can drive");
	}
	
}
