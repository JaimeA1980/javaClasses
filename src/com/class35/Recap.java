package com.class35;
import java.util.*;
public class Recap {

	public static void main(String[] args) {
		Set<Double> set = new TreeSet<>();
		set.add(99.99);
		set.add(90.99);
		set.add(59.99);
		set.add(39.99);
		set.add(19.99);

		//Retrieving Objects:
		//Iterator

		Iterator<Double> it = set.iterator();
		while(it.hasNext()){
			double d = it.next();  //unboxing
			if(d<50) {
				it.remove();
			}
		}

		for (Double d1:set){
			System.out.println(d1);
		}
		List<String> aList = new ArrayList<>();
		aList.add("John");
		aList.add("Jane");
		aList.add("James");
		aList.add("Jasmine");
		aList.add("Jane");
		aList.add("James");
		
		Set<String> hset = new HashSet<>();
		hset.addAll(aList);
		System.out.println(hset);
		
		aList.clear();
		System.out.println(aList);
		aList.addAll(hset);
		System.out.println(aList);
		}

}
