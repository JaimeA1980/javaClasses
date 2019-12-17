package com.class35;
import java.util.*;
public class TaskCountries {
	public static void main(String[] args) {
		Map<String, String> countries = new TreeMap<>();
		countries.put("Paraguay", "Asuncion");
		countries.put("Chile", "Santiago");
		countries.put("Ethiopia", "Addis Ababa");
		
		Set<String> keys = countries.keySet();
		for (String pais : keys) {
			System.out.println(pais+" = "+countries.get(pais));
		}
		System.out.println("**********WITH ITERATOR*******");
		Iterator<String> kIt=keys.iterator();
		while(kIt.hasNext()) {
			String paises = kIt.next();
			String capital = countries.get(paises);
			System.out.println(paises+"_"+capital);
		}
		System.out.println("***************VALUES ONLY***************");
		Collection<String> values = countries.values();
		for (String ciudad:values) {
			System.out.println(ciudad);
		}
			System.out.println("***VALUES WITH ITERATOR***");
			Iterator<String> valorIt = values.iterator();
			while(valorIt.hasNext()) {
			System.out.println(valorIt.next());
			}
	}
	

}
