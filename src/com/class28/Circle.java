package com.class28;
//Write program: Shape class has a constructor that takes the radius and has a subclass as  circle class. 
//In circle class create a method to calculate the area of circle. Test your code


public class Circle extends Shape{
	static double pi=3.14;
	Circle (int radius, double pi){
		super (radius);
		
		
	}
	public double round() {
		double area = ((radius*radius)*pi);
		return area;
	}
	public static void main(String[] args) {
		Circle a = new Circle(5, pi);
		System.out.println(a.round());
		
		
	}
}
