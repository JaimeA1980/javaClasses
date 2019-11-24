package com.class21;
//We declare a static variable in of type integer in class level. using the same variable try to complete the assignment. 
//for you to do follow the steps
//
//Step 1: Create a static method. inside the method write the code to increment the value of count one by one. (count ++)
//
//Step 2: Create 3 object of Main class. 
//
//Step 3: Call the method you create above with each object one by one
//
//Step 4: Print the variable count value 3 
//
//Output:
//3
//3
//3

class Main {
	static int count=0;
	static void x() {
		count++;
	}
	public static void main(String[] args) {
		Main obj1 = new Main();
		Main obj2 = new Main();
		Main obj3 = new Main();
		
		obj1.x();
		obj2.x();
		obj3.x();
		
		System.out.println(count);
		System.out.println(count);
		System.out.println(count);
		
	}
}