package com.class29;

public class VehicleTest {
	public static void main(String[] args) {
		//will access all parents method through inheritance plus new method of breaking defined in our class since it is now BMW parent
		Car car=new BMW();
		car.braking();
		car.drive();
		car.start();
		car.stop();
		car.speed();
		
		//will not be able to access braking since it was defined only in child class
		Vehicle vehicle = new BMW();
		vehicle.drive();
		vehicle.start();
		vehicle.stop();
		vehicle.speed();
		
	}
}
