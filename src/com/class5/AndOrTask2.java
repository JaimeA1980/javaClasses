package com.class5;

import java.util.Scanner;

public class AndOrTask2 {
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter your height");
		int feet=input.nextInt();
				
		
		if (feet<5) {
			System.out.println("You are short");
		} else if (feet==5 || feet==6) {
			System.out.println("You are medium");
		}else {
			System.out.println("You are tall");
		}
		
	}

}
