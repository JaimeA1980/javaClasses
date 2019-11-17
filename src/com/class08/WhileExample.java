package com.class08;

import java.util.Scanner;

public class WhileExample {

	public static void main(String[] args) {
		/*
		 * Let's ask user to enter if it is raining or not (true or false)
		 * as long as there is rain lets keep asking
		 * as soon as there i no rain --> You can go to the park
		 */
		
		Scanner scan=new Scanner(System.in);
		boolean isRain;
		
		
		do {
			System.out.println("Is it raining?");
			isRain=scan.nextBoolean();
			
		}while (isRain);
		System.out.println("You can go to the park");
		
	}
	
	
}
