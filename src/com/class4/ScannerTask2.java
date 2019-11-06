package com.class4;

import java.util.Scanner;

public class ScannerTask2 {
	public static void main(String[] args) {
		
		Scanner age=new Scanner(System.in);
		System.out.println("Please provide us your age");
		int num1=age.nextInt();
		
		if (num1>=18) {
			System.out.println("Congratulations, your license will be issued to you shortly!");
		}else {
			System.out.println("At this time, you will only qualify for a learners permit.");
			
		}
		
	}

}
