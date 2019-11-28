package com.class25_1;
//In carObject class:

//Create a two class level variable as below.
//
//model
//price, 
//quantity
//
//create one constructor with parameters of price and quantity. 
//
//in constructor assign the parameter value to class level value. (use this keyword). 
//
//Create a method with name carStockValue. write a logic to to calculate the total values of cars in stock. and print the result. 
//
//run the application in Main Class
//
//Output:
//
//Toyota 2019 Stock Value 2500000.0
//BMW 2019 Stock Value 652980.0
//
//Assignment Goal. Clean Code, This Keyword, Method Creation, Mathematic Operations. 

class CarObjects {
	String model;
	double price, quantity;

	public CarObjects(String model, double price, double quantity) {
		this.model = model;
		this.price = price;
		this.quantity = quantity;
	}

	public void carStockValue() {
		double sum = this.price * this.quantity;
		System.out.println(this.model + " Stock Value " + sum);
	}
	public static void main(String[] args) {
		CarObjects toyotaCar = new CarObjects("Toyota 2019", 25000, 100);
		toyotaCar.carStockValue();
		
		CarObjects bmw = new CarObjects("BMW 2019",65298, 10);
		bmw.carStockValue();
	}
}
