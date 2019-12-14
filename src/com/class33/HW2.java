package com.class33;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HW2 {
	public static void main(String[] args) {
		/*Create an arrayList of words.
		 * Remove every word that endswith "e".  Use interator
		 */
		
		List<String>list = new ArrayList<>();
		list.add("Cute");
		list.add("Love");
		list.add("Hello");
		list.add("Java");
		
		Iterator<String> it = list.iterator();
			
			while(it.hasNext()) {
				if(it.next().endsWith("e")) {
					it.remove();
					//break; it will only remove Cute and still print out Love, Hello, and Java
				}
			}
		System.out.println(list);
	}

}
