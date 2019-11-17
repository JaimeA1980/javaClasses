package com.class04;

import java.util.Scanner;

public class ScannerTask1 {
	public static void main(String[] args) {

		Scanner loan=new Scanner(System.in);
		System.out.println("Please enter amount of desired loan");
		int num1=loan.nextInt();
		
		if (num1<200000) {
			System.out.println("Congratulations, you are approved for this loan!");
		}else {
			System.out.println("We are sorry, you are not qualified for this loan");
			
		}

	}
}
