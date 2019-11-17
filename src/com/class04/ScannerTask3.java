package com.class04;

import java.util.Scanner;

public class ScannerTask3 {
	public static void main(String[] args) {
		//formula for F to C is: (aF-32)x5/9=bC
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter the name of a city");
		String city=scan.nextLine();
		
		System.out.println("Please enter a fahrenheit temperature value");
		int temp=scan.nextInt();
		
		int celsiusTemp=(temp-32)*5/9;
		System.out.println("The temperature in the city of "+city+" is "+celsiusTemp);
		
		
	}

}
