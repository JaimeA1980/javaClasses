package com.class31;

public abstract class Marks {
	abstract void getPercentage();
	double math;
	double english;
	double history;
	double java;
	
}
class A extends Marks{
	double math;
	double science;
	double history;
	
	A(double math, double science, double history){
		this.math=math;
		this.science=science;
		this.history=history;
	}
	

	@Override
	void getPercentage() {
		double average =(math+science+history)/3;
		 System.out.println(average);
	}
	

public static void main(String[] args) {
	A obj = new A(95,75,85);
	obj.getPercentage();
}
}
