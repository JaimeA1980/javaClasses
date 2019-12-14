package com.class34;

import java.util.*;

class Sweets {
	String name;
	
	public Sweets(String name) {
		this.name=name;		
	}
	
	public void ilove() {
		System.out.println("I love "+name);
		
	}

}

public class LinkedListDemo2 {
	public static void main(String[] args) {
		//create a list of Sweets objects
		
		LinkedList<Sweets> sweetList = new LinkedList<>();
		
		sweetList.add(new Sweets("Chocolate")); //0
		sweetList.add(new Sweets("Cake"));//1
		sweetList.add(new Sweets("Cookies"));//2
		sweetList.add(new Sweets("Macaroons"));//3
		
		for (Sweets element:sweetList) {
			System.out.println(element.name);
			element.ilove();
		} //retrieving 1 element and accessing method (2 steps)
		Sweets mySweet = sweetList.get(2);
		mySweet.ilove();
		
		//retrieving 1 element and accessing method (2 steps)
		sweetList.get(2).ilove();
		String nameOfTheSweet = sweetList.get(2).name;
		System.out.println((nameOfTheSweet));
		
		String str ="Hello 123";
		//"Hello 123 " ---> "Hello 456" (no space at end)
		str.replace("123", "456").trim();
		
		Integer num = 100;
		//100 --> "100"-->"200" ------------------------------->3                           
		int newNumber = num.toString().replace("100", "200").length();
		System.out.println(newNumber);
	}
}
