package com.class20;

public class Myself {

	public static void main(String[] args) {

		
		MySonMath son1 = new MySonMath();
		son1.name="Ensar";
		
		son1.add1();
		
		son1.add2(2, 3);
	
		int result = son1.add3();
		System.out.println(result);
		
		int result4 = son1.add4(5, 7);
		
		Myself mySelf = new Myself();
		
		
		if (result4==12) {
			System.out.println("Good Job");
		}else {
			System.out.println("You are not good enough, but it's ok");
		}

	 
	}
	 
	 
}
