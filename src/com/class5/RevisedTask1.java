package com.class5;

import java.util.Scanner;

public class RevisedTask1 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*ask user to enter boolean value for sale
		 * if no sale---> I am not shopping
		 * if sale---> check the price of the item
		 * based on the amount we will have to calculate the price after discount
		 * if price < 20 ---> apply 10%
		 * if price between 20-100 ---> 20%
		 * if between 100-500---> 30%
		 * anything above 500 ---> 50%
		 * 
		 * After discount___the price of the item is reduced from ___ to ___
		 */
		
		Scanner scan;
		
		double price;
		scan=new Scanner(System.in);
		int discount;
		double finalPrice;
		System.out.println("Is product on sale");
		boolean sale=scan.nextBoolean();
		if (sale) {
				System.out.println("What is price of item");
				price=scan.nextDouble();
				if (price<20) {
				discount=10;
				finalPrice=price-(price*0.1);
				}else if (price>=20 && price<100) {
				discount=20;
				finalPrice=price-(price*0.2);
				}else if (price>=100 && price<=500) {
				discount=30;
				finalPrice=price-(price*0.3);
				}else {
				discount=50;
				finalPrice=price-(price*0.5);
				}
				System.out.println("After discount "+discount+"% the price of the item is reduced from "+price+" to "+finalPrice);

	} else {
		System.out.println("I am not shopping");
		}	
			
	}

}
