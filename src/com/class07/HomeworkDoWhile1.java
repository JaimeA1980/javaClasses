package com.class07;

import java.util.Scanner;

public class HomeworkDoWhile1 {
	public static void main(String[] args) {
		/*.
		 * You need to ask user to pay for coffee
		 * You need to keep asking user to pay for it until
		 * entered price is equal =5;
		 * After user paid then say "Enjoy your coffee!"
		 */
		
		Scanner scan = new Scanner (System.in);
		
		int cash;
		
		do {
			System.out.println("Please pay for your coffee");
			cash=scan.nextInt();
			
		} while (cash!=5);
		System.out.println("Enjoy your coffee!");
		
		System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		
		//OR IF YOU USE JUST WHILE:
		
		
		int price1;
		System.out.println("Please pay for your coffee");
		price1=scan.nextInt();//4
		
		while(price1!=5) {
			System.out.println("Please pay for your coffee");
			price1=scan.nextInt();
		}
		System.out.println("Enjoy your coffee!");
		
	}
}
