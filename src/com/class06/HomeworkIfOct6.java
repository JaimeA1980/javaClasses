package com.class06;

import java.util.Scanner;

public class HomeworkIfOct6 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int num1, num2, num3;

		System.out.println("Enter a number");
		num1 = scan.nextInt();
		System.out.println("Enter a different second number");
		num2 = scan.nextInt();
		System.out.println("Enter a different third number");
		num3 = scan.nextInt();
		if (num1 > num2 && num1 > num3) {
			System.out.println(num1+" is greater than the other 2 numbers entered");
		} else if (num2 > num1 && num2 > num3) {
			System.out.println(num2+" is greater than the other 2 numbers entered");
		} else if (num3 > num1 && num3 > num2) {
			System.out.println(num3+" is greater than the other 2 numbers entered");
		} else {
			System.out.println("Please provide at least 2 different numbers");
		}
		
		
		
		
	}

}
