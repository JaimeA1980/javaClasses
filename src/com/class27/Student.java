package com.class27;

public class Student {
	public void read() {
		System.out.println("Always reading new material");
	}
	public void attend() {
		System.out.println("We are in class constantly");
	}
}
	class SyntaxStudent extends Student{
		
		public void read() {
			System.out.println("Reading past material from when Java was first implented");
		}
	
}
	class CollegeStudents extends Student{
		public void mingle() {
			System.out.println("Preppies mingle at parties");
		}
		public void attend() {
			System.out.println("Preppies play hookie");
		}
	}
	class SchoolStudent extends Student{
		public void attend() {
			System.out.println("High school students just need to attend school to graduate");
		}
		public void laidBack() {
			System.out.println("grade school kids life is laid back");
		}
	}