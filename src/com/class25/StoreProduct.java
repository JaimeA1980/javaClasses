package com.class25;

public class StoreProduct {

	String label;
	  double price;
	  String category;
	  boolean hasExpiration;
	  static int stock;
	  
	  public StoreProduct(String label, double price, String category, boolean hasExpiration, int stock){
	    this.label=label;
	    this.price=price;
	    this.category=category;
	    this.hasExpiration=hasExpiration;
	    this.stock=stock;
	  }
	  public StoreProduct(String label, double price, int stock){
	    this.label=label;
	    this.price=price;
	    this.category="misc";
	    this.stock=stock;
	  }
	  public StoreProduct(String label, double price){
	    this.label=label;
	    this.price=price;
	  }
	  public void display(){
		    System.out.println(this.label+" "+this.price+" "+this.category+" "+this.hasExpiration+" "+this.stock);
	  }	    
	  public static void main(String[] args) {
		StoreProduct obj = new StoreProduct("Eggs",3.0,"Produce",true,10);
		obj.display();
		
		StoreProduct obj2 = new StoreProduct("Paper Towels", 2.0, 24);
		obj2.display();
		
		StoreProduct obj3 = new StoreProduct("Paper Towels", 2.0);
		obj3.display();
		
		
	}
}
