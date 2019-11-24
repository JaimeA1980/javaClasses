package com.class23;

public class Task {
	
	Task(int num){
		System.out.println("This is constructor with parameter "+num);
	}
	
	Task(){
		System.out.println("This is constructor without parameter");
	}
	
	public static void main(String[] args) {
		
		Task obj1 =new Task();
		Task obj2 = new Task(1);
		
	}

}
