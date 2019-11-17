package com.class09;

import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		/*
		 * Write a program that reads a range of integers (Start and end point),
		 * provided by a user and then from that range prints the sum of the even and
		 * odd integers
		 */
		Scanner scan = new Scanner(System.in);
		int sumEven = 0;
		int sumOdd = 0;

		System.out.println("Enter a number");
		int start = scan.nextInt();
		System.out.println("Enter a second number that is higher");
		int end = scan.nextInt();

		for (int i = start; i <= end; i++) {
			if (i % 2 == 0) {
				sumEven=sumEven+i;
			}else {
				sumOdd = sumOdd+i;
			}
			
		}
		System.out.println("The total of all even #'s is "+sumEven);
		System.out.println("The total of all odd #'s is "+ sumOdd);

	}

}
