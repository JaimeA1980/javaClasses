package com.class14;

public class ScrapPaperIntQs {

	public static void main(String[] args) {
		 int x = 10;
         int y = 5;
         x = x + y;
         y = x - y;
         x = x - y;
         System.out.println("After swaping:" + " x = " + x + ", y = " + y);
         
         String a="Love";
         String b="You";
         
         System.out.println("Before swap: "+a+" "+b);
         
         a=a+b;
         b=a.substring(0, a.length()-b.length());
         
         a=a.substring(b.length());
         System.out.println("After: "+a+" "+b);
        	 

	}

}
