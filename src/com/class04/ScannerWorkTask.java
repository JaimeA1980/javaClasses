package com.class04;

import java.util.Scanner;

public class ScannerWorkTask {
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("How many years have you worked for this company?");
		int num1=input.nextInt();
		
		if (num1>=5) {
			System.out.println("Congratulations! Your bonus will arrive soon!");
			
		System.out.println("Please indicate your yearly salary.");
		int num2=input.nextInt();
		
		if (num2>=50000) {
			System.out.println("Congratulations! Your bonus this year is $5000!");
		}else {
			System.out.println("Congratulations! Your bonus this year is $3000!");
		}
		
		}else {
			System.out.println("We apologize! You do not qualify for a bonus at this time.");
		}
		
	}

}
