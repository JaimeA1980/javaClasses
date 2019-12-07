package com.class30;

public class VehicleTest {
	public static void main(String[] args) {

		BMW bmw = new BMW("767jbh676", "Sedan", "BMW", "X5");
		BMW.displayTotal();
		bmw.braking();
		// comes from BMW - wont be available to the parent
		// car.display();
		bmw.speed();
		bmw.stop();
		bmw.drive();
		bmw.start();
		// comes from Car class
		
		Car car =new BMW("MVB3847378", "Sedan", "SUV", "X3");
		//car.display()comes from B<W and will not be available to the parent
		car.braking();
		car.drive();
		car.speed();
		car.start();
		car.stop();
		

		Vehicle vehicle = new BMW("767jbh676", "Sedan", "BMW", "X5");
		// come from Vehicle class
		vehicle.drive();
		vehicle.stop();
		vehicle.speed();
		vehicle.start();
		// comes from car class
		// vehicle.breaking();
		// comes from BMW - wont be available to the grandparent
		// vehicle.display();
		BMW.displayTotal();
		
		new BMW("87996", "Truck", "BMW", "A7");
		new BMW("yiu878989yiy", "Sedan", "SUV","X3");
		new BMW("yiu878989yiy", "Sedan", "SUV","X3");
		Vehicle.displayTotal();
	}
}
