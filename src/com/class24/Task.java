package com.class24;

import com.class23.CarTest;

public class Task {

	public Task() {
		System.out.println("I am public constructor");
	}
	
	Task(String str){
		System.out.println("I am default constructor");
	}
	
	protected Task (int num) {
		System.out.println("I am protected constructor");
	}
	
	private Task (int num, int num2) {
		System.out.println("I am proavet constructor");
		
	}
	public static void main(String[] args) {
		Task obj = new Task();
		Task obj1 =new Task(4);
		Task obj2 = new Task(4,5);
		Task obj3 = new Task("Some String");
	}
	
	//look at notes, on javaclass	24

}
