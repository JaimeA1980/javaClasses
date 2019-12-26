package com.class37;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Repl211 {
	public static void main(String[] args) {
		
	
	//declare a List in which we store collection of Maps
	List<Map<String, Object>> dataList = new ArrayList<>();
	
	//create a map that will store String as Key and object as value
	Map<String,Object> appleMap = new TreeMap<>();
	appleMap.put("Items","Apple");
	appleMap.put("Price", 20.00);
	appleMap.put("Quantity", 10.0);
	
	//storing map inside the list
	dataList.add(appleMap);
	
	//create a map that will store String as Key and Object as value
	
	
	}
}
