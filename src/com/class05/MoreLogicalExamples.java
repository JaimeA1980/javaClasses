package com.class05;

import java.util.Scanner;

//to import shortcut is ctr+shft+o
//FOR MAC CMD+shft+o
public class MoreLogicalExamples {

	public static void main(String[] args) {
		/*ask user to enter daily sales
		 * based on the sales range we want to give commission to the person
		 * if sales is <100--> commissionis 10%
		 * if sales is between 100 - 200 --> commission of 20%
		 * etc
		 */
		Scanner scan;
		double salesAmount;
		double commission;
		
		scan=new Scanner(System.in);
		System.out.println("Please enter your total sales amount");
		salesAmount=scan.nextDouble();
		
		if (salesAmount<100) {
			//lets give user 10% commission of a sale
			commission=salesAmount*0.1;
		}
		
		
		
	}
	
}
