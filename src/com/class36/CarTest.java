package com.class36;

import java.util.Map.Entry;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import java.util.Iterator;

class Car{
	
	//create a car class that will have variables, methods, and constructors
		//create a map that will hold car numbers which are assigned and car objects store in it
		
	String make, model;
	
	public Car(String make, String model) {
		this.make = make;
		this.model = model;
	}
	public void display() {
		System.out.println(make+" "+model);
	}
}


public class CarTest {
	
	public static void main(String[] args) {
		Map<Integer, Car> mapCar = new LinkedHashMap<>();
		mapCar.put(1, new Car("BMW","X5"));
		mapCar.put(2, new Car("Tesla","S"));
		mapCar.put(3, new Car("Mercedes","S5"));
		mapCar.put(4, new Car("Toyota","Rav4"));
		mapCar.put(5, new Car("Honda","Civic"));
		mapCar.put(2, new Car("Lincoln","MKC"));
		
		System.out.println(mapCar.size());
				
		//display only value objects
		Collection<Car>coll = mapCar.values();
		for (Car c:coll) {
			System.out.println(c.make+"---"+c.model);
			c.display();
		}
		
		//map key to its corresponding values (entrySet), 
		
		Set<Entry<Integer, Car>> set = mapCar.entrySet();
		for (Entry<Integer, Car> ent: set){
			Integer i = ent.getKey();
			Car c = ent.getValue();
			System.out.println("Key "+i+" is associated with value of "+c.make);
		}
		//using keyset to map keys to values
		Set<Integer> keySet=mapCar.keySet();
		for (int key:keySet) {
			//                 Integer + map Object->value Object (car type)
			System.out.println(key+"="+mapCar.get(key).make);// you can also add +mapCar.get(key).model);
		//or Car car = mapCar.get(key);
			//String carDetails = car.make+"-"+car.model;
			//System.out.println(key+"="+carDetails);
		}
		System.out.println("**********************ITERATOR WITH ENTRY SET**********************************");
		//use Iterator to iterate through values, keySet, entry set
		Iterator<Entry<Integer, Car>> carIt = set.iterator();
		while(carIt.hasNext()) {
			Entry<Integer,Car> carEnt = carIt.next();
			String carDetails = carEnt.getKey() + "="+carEnt.getValue().make+" "+carEnt.getValue().model;
			System.out.println(carDetails);
			
		}
		System.out.println("**************ITERATOR WITH KEY SET*****************************");
		Iterator<Integer>carKeys = mapCar.keySet().iterator();
		while(carKeys.hasNext()) {
			Integer carKey = carKeys.next();
			Car val = mapCar.get(carKey);
			System.out.println(carKey+"="+val.make+" "+val.model);
			
		}
	}

}
