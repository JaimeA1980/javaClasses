package com.class7;

public class DoWhile {

	public static void main(String[] args) {
		int num = 10;
		
		while (num<=7) {  //mostly used
			System.out.println("Hello");
			num++;
		}
		//rare
		int num1=7;
				
				do {
					System.out.println("Bye");
					num1++;
				}while (num1<=7);
		
				System.out.println("******************************************************************************************************************************************************");
		// print even numbers from 20 to 50 using do while
				int num2=20;
				do {
					System.out.println(num2);
					num2+=2;
				}while (num2<=50);
				
		
	}
	
}
