package com.class34;
import java.util.*;

public class LinkedListDemo {
	public static void main(String[] args) {
		
		LinkedList<String> llist = new LinkedList<>();
		//adding elements
		llist.add("Hello");
		llist.add("Bye");
		llist.add("Hello");
		llist.add("Bye");
		llist.add(2,"How are you?");
		System.out.println(llist);
	
		
		//replace 1 element
		llist.set(1, "Good bye");
		System.out.println(llist);
		
		//retrieve 1 element
		String element = llist.get(2);
		System.out.println(element);
		
		//retrive all elements
		System.out.println("***********************1st way**************************");
		for (int i=0; i<llist.size(); i++) {
			System.out.println(llist.get(i));
		}
		System.out.println("***********************2nd way**************************");
		for (String el: llist) {
			System.out.println(el);
		}
		System.out.println("************************3rd way****************************");
		Iterator<String> it = llist.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
	}

}
