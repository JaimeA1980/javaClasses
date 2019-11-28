package com.class26;

public class EmployeeTest {
	 public static void main(String[] args) {
		 
		 Employee emp = new Employee();
		 emp.salary=80000;
		 emp.getPaid();
		 
		 FullTime ft = new FullTime();
		 ft.salary = 900000;
		 ft.bonus=10000;
		 ft.getPaid();
		 
	 }

}
