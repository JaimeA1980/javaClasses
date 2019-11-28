package com.class25_1;

public class ShoppingStore {
	
	String item;
	double price;
	int quantity;
	
	ShoppingStore(String item, double price, int quantity){
		this.item=item;
				this.price=price;
				this.quantity=quantity;
	}
	public double itemTotalPrice() {
		double result = price * quantity;
		return result;
	}
	public static void main(String[] args) {
		
		ShoppingStore blancket = new ShoppingStore("Blancket" , 49.99, 2);
		blancket.itemTotalPrice();
	      
		ShoppingStore mattress = new ShoppingStore("Mattress" , 219.59, 2);
		mattress.itemTotalPrice();
		
		double grandTotal=blancket.itemTotalPrice()+mattress.itemTotalPrice();
		
		System.out.println("Blancket total value "+blancket.itemTotalPrice());
		System.out.println("Mattress total value "+mattress.itemTotalPrice());
		System.out.println("You purchased "+grandTotal+" Today");
	      
	}
		
	
	
}
