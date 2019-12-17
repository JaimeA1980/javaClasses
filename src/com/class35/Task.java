package com.class35;
import java.util.*;
public class Task {
	public static void main(String[] args) {
		Map<Integer, String> co = new HashMap<>();
		co.put(1, "Google");
		co.put(2, "Syntax");
		co.put(3, "Amazon");
		co.put(4, "Yahoo");
		co.put(5, "Apple");
		co.put(6, "Amazon");
		co.put(7, "Dairy Queen");
		
		System.out.println(co.size());
		co.replace(4, "Pollo Campero");
		System.out.println(co);
		co.remove(7);
		System.out.println(co);
		
	}

}
