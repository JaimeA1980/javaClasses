package com.class37;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class MethodReturnObject {
	// create a method that will return an object
	// create a method that will return an object of Scanner Class
	public static void main(String[] args) {
		List<String> list1 = returnStringList("Java", "My favorite subject");
		System.out.println(list1);

		Scanner scan =returnScanner(); //still do not understand how to do this
		

	}

	public static Scanner returnScanner() {
		Scanner scan = new Scanner(System.in);
		return scan;
	}

	// create a method that will return an object of ArrayList Class
	public static List<String> returnStringList(String str, String str1) {
		List<String> list1 = new ArrayList<>();
		list1.add(str);
		list1.add(str1);

		return list1;
	}

	// create a method that will return an Object of Map Class
	public static Map<String, String> returnMap(String key, String value, String key1, String value1) {
		Map<String, String> map = new HashMap<>();
		map.put(key, value);
		map.put(key1, value1);

		return map;
	}
}
