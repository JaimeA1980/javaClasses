package com.class5;

public class AndOrTask {
	public static void main(String[] args) {
		
		int day=74;		
		
		if (day>=1 && day<=5) {
			System.out.println("It is a weekday");
		}else if (day==6 || day==7) {
			System.out.println("It is a weekend");
		}else {
			System.out.println("Invalid day");
		}
	}

}
