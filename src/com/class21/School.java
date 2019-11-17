package com.class21;

import com.class20.Myself;  //com.class20.*   -->brings all the classes from the package

public class School {
	public static void main(String[] args) {
		
		Student.school = "Morning School";
		
		
		Student student0 =new Student();
		
		student0.displayInfo();
				
		Student student1 =new Student();
		//assigning instance variables
		
		student1.studentName="Eric";
		student1.GPA =3.95;
		student1.school ="Syntax";
		
		student1.displayInfo();
		
		Student student2 =new Student();
		student2.studentName ="Jaime";
		student2.GPA =3.90;
		student2.school = "Syntax Technologies";
		
		student2.displayInfo();
		
		System.out.println("student1 again");
		student1.displayInfo();
		
		System.out.println("student0 info");
		
		student0.displayInfo();
		
		
		
		
		
//		int hour1=3, hour2;
//		hour1 =4;
//		student1.displayInfo();
//		student1.study(3);
//		student1.displayInfo();
//		
		
	}

}
