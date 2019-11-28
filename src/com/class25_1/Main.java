package com.class25_1;

public class Main {
	public static void main(String[] args) {
		Employee mem1 = new Employee();
		mem1.name = "Joe";
		mem1.lastName = "Smith";
		mem1.age = 35;
		mem1.salary = 35000;

		Student mem2 = new Student();
		mem2.name = "Adam";
		mem2.lastName = "Smith";
		mem2.age = 15;
		mem2.grade = 10;

		Retiree mem3 = new Retiree();
		mem3.name = "Frank";
		mem3.lastName="Smith";
		mem3.age = 15;
		mem3.seniorActivity="tour";
		
		mem1.emp();
		mem2.stud();
		mem3.old();
		
		

	}
}
