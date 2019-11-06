package com.class10;

public class Countries {
	public static void main(String[] args) {

		// Create an array of countries. While retrieving all values from an array print
		// capital for each country.

		String[] country = { "Chile", "Paraguay", "Argentina", "Brazil", "Colombia" };
		
		for (int i=0; i<country.length; i++) {
			if (country[i].equals("Paraguay")) {
				System.out.println("Asuncion");
			}else if(country[i].equals("Chile")) {
				System.out.println("Santiago");
			}else if (country[i].equals("Argentina")) {
				System.out.println("Buenos Aires");
			}else if (country[i].equals("Colombia")) {
				System.out.println("Bogota");
			}else {
				System.out.println("Brasilia");
			}
		}

	}

}
