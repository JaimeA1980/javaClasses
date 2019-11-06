package com.class6;

import java.util.Scanner;

public class SwitchHW2 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your letter grade");
		char grade = scan.next().charAt(0);
		String explanation;

		switch (grade) {

		case 'A':
			explanation = "Excellent";
			break;
		case 'B':
			explanation = "Good";
			break;
		case 'C':
			explanation = "Average";
			break;
		case 'D':
			explanation = "Bad";
			break;
		default:
			explanation = "Unacceptable";
		}
		
		System.out.println("Letter grade "+grade+" is considered "+explanation);
		
	}
}