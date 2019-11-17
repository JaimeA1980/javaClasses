package com.class02;

public class PerimeterAndArea {

	public static void main(String[] args) {
		
		int width=5;
		int height=8;
		
		int area=width*height;
		int perimeter=2*(width+height);
		
		/*
		 * "The perimeter of a rectangle with width___
		 * and height___ is equal to ___and the area is___"
		 */
		
		System.out.println("The perimeter of rectangle with width "+width+" and height "+height+" is equal to "+perimeter+" and the area is "+area);

		String message="The perimeter of rectangle with width "+width+" and height "+height+" is equal to "+perimeter+" and the area is "+area;
		
		System.out.println(message);
		
	}
}
