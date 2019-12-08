package com.class31;

public class Circle implements Shape{
	double pi = 3.14;
	double radius = 6;
	@Override //pi*radius*radius
	public void calculateArea() {
		System.out.println(pi*radius*radius);	
		
	}

	@Override //2*pi*radius
	public void calculatePerimeter() {
		System.out.println(2*pi*radius);
		
	}
	public static void main(String[] args) {
		Circle obj = new Circle();
		obj.calculateArea();
		obj.calculatePerimeter();
		
	}
}
