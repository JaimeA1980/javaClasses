package com.class06;

import java.util.Scanner;

public class HomeworkIfOct62 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int num1, num2, num3;

		System.out.println("Enter first number greater than 0");
		num1 = scan.nextInt();
		if (num1 > 0) {
			System.out.println("Great! Now enter a number greater than " + num1);
			num2 = scan.nextInt();
			
			if (num2 > num1) {
				System.out.println("Awesome! Now enter a number greater than " + num2);
				num3 = scan.nextInt();
				
				if (num3 > num1 && num3 > num2) {
					System.out.println("Wonderful! " + num3 + " is greater than " + num1 + " and " + num2
							+ "! Thanks for following instructions! :)");
				} else {
					System.out.println(":_(  Try again...This number should be greater than "+num1+" and "+num2);
				}
				
			} else {
				System.out.println(
						"Try again...This number should be greater than " + num1 + " *man with forehead in hand emoji");
			}

		} else {
			System.out.println("Number must be greater than 0...smh");
		}
	}

}
