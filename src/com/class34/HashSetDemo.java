package com.class34;
import java.util.HashSet;
import java.util.*;

public class HashSetDemo {
	public static void main(String[] args) {
		//lets create a collection of veggies where I do not want to have dublicates
		
		HashSet<String> hset=new HashSet<>();
		//storing values int hashset
		hset.add("cucumber");
		hset.add("onion");
		hset.add("pepper");
		hset.add("zucchini");
		hset.add("carrot");
		hset.add("zucchini");
		
		System.out.println(hset.size());
		System.out.println(hset);
		
		//the do not have any methods to retrieve elements from the collection
		//.get(); , .set();
		
		//how can we retrieve all elements?
		//iterator
	
		Iterator<String> it = hset.iterator();
		while(it.hasNext()) {
			String element =it.next();
			System.out.println(element);
		}
		for (String el:hset) {
			System.out.println(el);
		}
		
	}
}
