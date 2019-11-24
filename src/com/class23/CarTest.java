package com.class23;

public class CarTest {

	public static void main(String[] args) {

		Car.make = "Toyota";

		Car car1 = new Car();
		car1.model = "Camry";
		car1.color = "Pink";
		car1.getDetails();

		Car car2 = new Car();
		car2.model = "Corolla";
		car2.color = "Blue";
		car2.getDetails();

	}

}
