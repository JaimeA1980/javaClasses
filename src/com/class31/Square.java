package com.class31;

public class Square	implements Shape{
	int a = 6;
	@Override
	public void calculateArea() {
		System.out.println(a*a);
		
	}

	@Override
	public void calculatePerimeter() {
		System.out.println(4*a);
		
	}
	public static void main(String[] args) {
		Square obj = new Square();
		obj.calculateArea();
		obj.calculatePerimeter();
	}

}
