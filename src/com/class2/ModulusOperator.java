package com.class2;

public class ModulusOperator {
	
	public static void main(String[] args) {
		
		float num1=12.5f;
		float num2=3.5f;
		
		float div=num1/num2;
		System.out.println(div);
		
		int number1=13;
		int number2=2;
		int divOfIntegers=number1/number2;
		
		System.out.println(divOfIntegers);
		// it is better to use float values, float or double
		
		double d=12;
		System.out.println(d);
		
		//int i=12.5;  cannot convert from double
		
		//modulus gives remaining of the division
		
			int a=15;
			int b=4;
			int remainder=a%b;
			System.out.println(remainder);
			
			//int myNumber=8+8*2;// the multiplication is first, then the addition
			int myNumber=8+8%2;// the module is done first, so it will print 8
					System.out.println(myNumber);
					
			
			
		
		
		
		
		
	}

}
