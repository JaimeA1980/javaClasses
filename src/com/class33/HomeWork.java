package com.class33;

import java.util.ArrayList;
import java.util.Iterator;

public class HomeWork {
	
	public static void main(String[] args) {
		/*
		 * Create an arrayList of cars and retrieve all the values
		 * using 3 different ways
		 */
		
		ArrayList<String> car = new ArrayList<>();
		car.add("Nissan");
		car.add("Toyota");
		car.add("Honda");
		car.add("BMW");
		
		System.out.println("******************FIRST********************");
		for (String AM:car) {
			System.out.println(AM);
		}
		System.out.println("*****************SECOND*****************");
		for (int i = 0; i<car.size(); i++) {
			System.out.println(car.get(i));
		}
		System.out.println("****************************THIRD******************************");
		Iterator<String> it = car.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
