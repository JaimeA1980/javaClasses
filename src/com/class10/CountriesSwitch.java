package com.class10;

public class CountriesSwitch {

	public static void main(String[] args) {

		String[] country = { "Chile", "Paraguay", "Argentina", "Brazil", "Colombia" };
		
		
		for (int i = 0; i < country.length; i++) {

			switch (country[i]) {

			case "Afghanistan":
				System.out.println("Kabul");
				break;
			case "Colombia":
				System.out.println("Bogota");
				break;
				
			}

		}
	}

}
