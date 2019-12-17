package com.class36;
import java.util.*;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import java.util.Iterator;

//Create a Person class with following private fields: name, lastName, age, salary. 
//Variables should be initialized through constructor.
//Inside the class also create a method to print user details.
//In Test Class create a Map that will store key in ascending order. In that map store personId and a Person Object. Print each object details.


class Person {
	private String name;
	private String lastName;
	private int age;
	private int salary;
	
	Person(String name, String lastName, int age, int salary){
		this.name=name;
		this.lastName=lastName;
		this.age=age;
		this.salary=salary;
	}
	public void personInfo() {
		System.out.println(name+lastName+age+salary);
	}
}
public class Task1Person{
	public static void main(String[] args) {
		Map<Integer, Person>obj = new TreeMap<>();
		obj.put(1, new Person("Jaime", "Aneiva", 39, 100));
		obj.put(2, new Person("Analia", "Ayala", 28, 300));
		
		Set<Integer>obj2=obj.keySet();
		
			
		}
			
			
		
	
}
