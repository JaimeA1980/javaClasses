package com.class27;

public class StudentTest {

	public static void main(String[] args) {

		Student stud1 = new SyntaxStudent();
		stud1.attend();
		stud1.read();
		
		Student stud2 = new CollegeStudents();
		stud2.attend();
		stud2.read();
		
		Student stud3 = new SchoolStudent();
		stud3.attend();
		stud3.read();
		
		SchoolStudent ss = new SchoolStudent();//must create object for that student class
		ss.attend();
		ss.read();
		ss.laidBack();
		

	}

}
