package com.class32;

import java.util.ArrayList;

public class Task {
	public static void main(String[] args) {
		//Generic
		ArrayList<String> aL =new ArrayList<>();
		aL.add("Jim");
		aL.add("Sara");
		aL.add("Carlos");
		aL.add("Noemi");
		aL.add("Sohil is looking over my shoulder");
		
		System.out.println(aL.isEmpty());
		
		System.out.println(aL.contains("Noemi"));
		
		int size =aL.size();
		System.out.println(size);
		
		for (String i:aL) {
			System.out.println(i);
			//or
			System.out.println(aL);
		}
		//ArrayList can be Generic and non-Generic
		
		//Non Generic
		ArrayList alist=new ArrayList();
		alist.add("Hello");
		alist.add(100);
		alist.add(10.10);
		alist.add(true);
		alist.add('c');
		
		System.out.println(alist);
		
		ArrayList<Double> list = new ArrayList<Double>();
		list.add(100.10);
		
	}

}
