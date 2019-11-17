package com.class06;

import java.util.Scanner;

public class SwitchHW3 {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("First number");
		int num1, num2, num3;//or num3=0
		num1=scan.nextInt();
		
		System.out.println("Enter Operator");
		char function=scan.next().charAt(0);
		
		System.out.println("Enter second number");
		num2=scan.nextInt();
		
	
		
		
		
		switch (function) {
		
		case '+':
			num3=num1+num2;
			break;
		case'-':
			num3=num1-num2;
			break;
		case'*':
			num3=num1*num2;
			break;
		case'/':
			num3=num1/num2;
			break;
			
			default:
				num3=0;//or System.out.println("Not an operator");
		}
		System.out.println("Result is "+num3);
		
	}
}
