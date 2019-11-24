package com.class23;

import com.class18.Main;

public class Students {
	
	
	String name;
	int grade1, grade2, grade3, GPA;
	
	Students(String studentName, int gr1, int gr2, int gr3){
		name=studentName;
		grade1=gr1;
		grade2=gr2;
		grade3=gr3;
		
		
}		
		public void calculateAverage() {
			int average=(grade1+grade2+grade3)/3;
			System.out.println("Student "+name+" has an average grade of "+average);
			
	}
	
	public static void main(String[] args) {
		
		Students student1=new Students("John", 90, 78, 100);
		student1.calculateAverage();
	//there were 4 more but I am done...
		
	}
}	
	


