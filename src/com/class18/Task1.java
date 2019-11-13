package com.class18;

public class Task1 {
	//create a method that will take 2 parameters as numbers and prints which number is larger
	
	public static void main(String[] args) {
		Task1 num = new Task1();
		num.number(54, 56);
		num.evenOdd(49);
		num.palindrome("kayak");
	}
	
	
	void number(int num1, int num2) {

		
		if (num1>num2) {
			System.out.println(num1);
		}else if (num1<num2){
			System.out.println(num2);
		}else {
			System.out.println("Numbers are equal");
		}
	}
	//Create a method that will take a number and prints whether the number is even or odd
	void evenOdd(int num3) {
		
		if (num3%2==0) {
			System.out.println("even");
		}else {
			System.out.println("odd");
			
		}
		
		
	}
	//create a method that will print whether a given String is a palindrome or not
	void palindrome(String word) {
	String reverse = "";
	for (int i=word.length()-1;i>=0;i--) {
		reverse+=word.charAt(i);
	}
	if (word.equals(reverse)) {
		System.out.println("Palindrome");		
	}else {
		System.out.println("Not a palindrome");
	}
		
		
	}
}
