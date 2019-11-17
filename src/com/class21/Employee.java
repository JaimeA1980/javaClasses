package com.class21;

public class Employee {
	int eID, salary;
	public static String CEO = "Sumair";
	
	public static void main(String[] args) {
		Employee employed =new Employee();
		
		employed.eID = 15;
		employed.salary =100000;
		
		System.out.println(employed.eID+" "+employed.salary+" "+employed.CEO);
		 
		
		
				
	}

}
