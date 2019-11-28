package com.class25;

public class SyntaxTechnologies {
	String schoolName;
	  int batch;
	  String year;
	  String lastDayOfClass;
	  
	  public SyntaxTechnologies(){
	  }
	  public SyntaxTechnologies(String schoolName, int batch, String year, String lastDayOfClass){
	    this.schoolName=schoolName;
	    this.batch=batch;
	    this.year=year;
	    this.lastDayOfClass=lastDayOfClass;
	  }
	  public void display() {
		  System.out.println(this.schoolName+" "+this.batch+" "+this.year+" "+this.lastDayOfClass);
	  }
	  public static void main(String[] args) {
		SyntaxTechnologies obj = new SyntaxTechnologies();
		SyntaxTechnologies obj2 = new SyntaxTechnologies("Syntax", 4, "2019", "07/30/2019");
		obj.display();
		obj2.display();
	}
}
