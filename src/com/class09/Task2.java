package com.class09;

import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int guess;
		int right = 8;
		boolean win = false;

		while (!win) {

			System.out.println("Guess the secret number between 1 and 20!");
			guess = scan.nextInt();

			if (guess == right) {
				win = true;
			} else if (guess < right) {
				System.out.println("Your guess is too low, try again!");
			} else if (guess > right) {
				System.out.println("Your guess is too high, try again!");
			}
		}
		scan.close();
		System.out.println("Congratulations, you got it!!!");
	}

}
