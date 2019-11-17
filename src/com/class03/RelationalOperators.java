package com.class03;

public class RelationalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1=20;
		int num2=19;
		
		System.out.println(num1>num2);
		System.out.println(num1<num2);
		System.out.println("************");
		
		double d=1.99;
		double d1=2.99;
		
		boolean b=d>d1;
		System.out.println(b);
		
		boolean b1=d<d1;
		boolean b2=d==d1;
		boolean b3=d!=d1;
		System.out.println(b1);//true
		System.out.println(b2);//false
		System.out.println(b3);//true
		System.out.println("******************************************");
		
		int a=20;
		int b4=300;
		//if number a is bigger than number b
		// i want to print a is larger than b
		// if condition is true it will execute "a is bigger than b"
		// if conditions is falste it will execute "a is smaller than b"
		
		if (a>b4) {
			System.out.println("a is larger than b");	
		}else {
			System.out.println("a is smaller than b");
			
			System.out.println("**************************************************");
		}
		
		int expectedHours=15;
		int actualHours=20;// was 2 so was printing "please study more"
		//if expected hours are more than actual -> you will succeed
		//otherwise, please study more
		
		if(actualHours>expectedHours) {
			System.out.println("you will succeed");
		}else {
			System.out.println("please study more");
			System.out.println("**************************************************");
		}
		
		double teaPrice=4.99;
		double allowedPrice=3.99;
		teaPrice-=2;//2.99=4.99-2
		
		//if price is more than I can afford I will NOT buy
		//if price is less or matches what I can afford then I will buy tea
		
		if(allowedPrice>=teaPrice) {
			System.out.println("I will buy tea");
			System.out.println("And I will enjoy my tea");
		
		}else {
			System.out.println("I cannot afford, I need to study more");
			System.out.println("I will go back to study more");
		}
				
		System.out.println("I keep writing some code");
		System.out.println("I keep writing more code");
		
	}

}
