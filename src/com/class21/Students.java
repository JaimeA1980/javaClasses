package com.class21;

//Create a Class called Students
//● Create three variables studentName , studentID and numberOfStudents
//● Create three objects of the Students Class
//● Set the value for studentName , studentID and increment the numberOfStudents for each object
//● Print out total number of students


public class Students {
	public String studentName;
	public int studentID;
	public static int numberOfStudents;
	
	public static void main(String[] args) {
		Students pupil1=new Students();
		Students pupil2=new Students();
		Students pupil3=new Students();		

		
		pupil1.studentName = "Maurice";
		pupil1.studentID = 10;
		pupil1.numberOfStudents++;
		
		
		pupil2.studentName = "Claire";
		pupil2.studentID = 11;
		pupil2.numberOfStudents++;
		
		
		pupil3.studentName = "David";
		pupil3.studentID = 12;
		pupil3.numberOfStudents++;
		
		
		System.out.println("The total number of students is: "+Students.numberOfStudents);
		
		
		
	}

}
