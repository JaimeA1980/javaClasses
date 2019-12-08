package com.class31;
class B extends Marks{
	double math, science, history, phys;
	B(double math, double science, double history, double phys){
		this.math=math;
		this.science=science;
		this.history=history;
		this.phys=phys;
		
	}

	@Override
	void getPercentage() {
		double average = (math+science+history+phys)/4;
		System.out.println(average);
		
	}
	public static void main(String[] args) {
		B obj1 = new B(95,85,85,95);
		obj1.getPercentage();
		
	}
}