package com.class4;

public class NestedIfTask2 {
	public static void main(String[] args) {
		
	double rate=5.5;
	int mort=20000;
	
	if (rate>4.5) {
		System.out.println("Customer will not buy house");
	}else {
		System.out.println("Customer will consider buying house");
		
		if (mort>200000) {
			System.out.println("Customer will purchase loan");
		}else {
			System.out.println("Customer will pay cash for house");
		}
	}
	}
}