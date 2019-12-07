package com.class27;

public class FinalKeyword {
	
	public final String str="Hello";

	public static void main(String[] args) {
		
		String str ="I am awesome";
		str="I am cool";
		System.out.println(str);
		
		final String finalString="Java me esta rompeando las pelotas";
		//finalString ="Java es facil"; compiler error
		
		final int age=120;
		//age = 100;compiler error

	}

}
