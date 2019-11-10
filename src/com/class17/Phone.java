package com.class17;

public class Phone {
	
	String platform,name, brand;
	
	void playGames() {
		System.out.println("One can play games on "+name);
	}
	void pics() {
		System.out.println("One can take pictures with an "+name);
	}void calls(){
		System.out.println("One can call anyone with an "+name);
	}
	public static void main(String[] args) {
		Phone cell=new Phone();
		cell.brand="Apple";
		cell.name="Iphone";
		cell.platform="IOS";
		System.out.println("The "+cell.brand+" "+cell.name+" "+" with operating system "+cell.platform+" is a dynamic phone!");
		cell.playGames();
		cell.pics();
		cell.calls();
	}
	
	
	
}
