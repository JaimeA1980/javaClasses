package com.class24;

public class Country {
	
	public String capital, name;
	public int population;

	Country(){
		System.out.println("I am non argument constructor");
	}
	
	Country(String countryName, String countryCapital){
		name=countryName;
		capital=countryCapital;
	} 
	public void displayInfo() {
		System.out.println(name+" "+capital);
	}
	public static void main(String[] args) {
		
//		Country country1 =new Country();
//		country1.name="USA";
//		country1.capital="Washington DC";
//		
//		Country country2 =  new Country();
//		country2.name="Kazakhstan";
//		country2.capital="Astana;"
	
	
	Country country1 =  new Country("USA", "Washington DC");
	Country country2 = new Country("Kazakhstan", "Astana");
	Country country3=new Country();
	
	country1.displayInfo();
	country2.displayInfo();
	country3.displayInfo();
	System.out.println(country1.name);
	System.out.println(country1.capital);
	
	
	}

}
