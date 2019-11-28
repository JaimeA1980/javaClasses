package com.class25_1;

public class Repl {
	private static void m1(){
	    System.out.println("private m1 method");
	  }
	  private static void m1(int num){
	    System.out.println("private m1 method with int parameter");
	  }
	  public static void main(String[] args){
	    m1();
	    m1(5);
	  }

}
