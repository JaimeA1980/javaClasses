package com.class09;

import java.util.Scanner;

public class Task2ReviewDoWhileSolution {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int secretNumber, guessNumber;
		secretNumber=12;
		
		do {
			System.out.println("Please guess my number from 1 to 20");
			guessNumber=scan.nextInt();
			
			if(guessNumber<secretNumber) {
				System.out.println("Your number is too small");
			}else if (guessNumber>secretNumber) {
				System.out.println("Your number is too large");
			}
			
		}while (guessNumber!=secretNumber);
		
		
		System.out.println("Congratulations, you got it");

	}

}
