package com.class4;

import java.util.Scanner;

public class ScannerCCTask {
	public static void main(String[] args) {
		
		Scanner input =new Scanner(System.in);
		System.out.println("Do you currently own a credit card?");
		boolean cc=input.nextBoolean();
		
		
		if (cc) {
			System.out.println("What is your outstanding balance on your card(s)?");
			int num1=input.nextInt();
			
			if (num1>1000) {
				System.out.println("Please pay your outstanding balance ASAP!");
			}else {
				System.out.println("Great job on keeping up on your payments! Spend wisely!");
			}
		}else {
			System.out.println("Would you like to apply for one today?");
		}
			
			
	}
		
}


