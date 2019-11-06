package com.class6;

import java.util.Scanner;

public class ClassTask {
public static void main(String[] args) {
	/* ask user to enter the month they were born
	 * based on the month define the season
	 * if user is born in Dec, Jan, Feb ---> Winter
	 * if mar, apr, may --> spring
	 * if jun, jul, aug --> Summer
	 * if sep, oct, nov --> fall
	 * otherwise --> unknown
	 * at the end of the program
	 * "You were born in ____"
	 */
	
	Scanner input;
	String month;
	input=new Scanner(System.in);
	
	System.out.println("Enter month you were born");
	month=input.nextLine();
	
	String season;
	
	if (month.equals("January") || month.equals("February") || month.equals("December")) {
		season="Winter";
	}else if (month.equals("March") || month.equals("April") || month.equals("May")) {
		season="Spring";
	}else if (month.equals("June") || month.equals("July") || month.equals("August")) {
		season="Summer";
	}else if (month.equals("September") || month.equals("October") || month.equals("November")) {
		season="Fall";
	}else {
		season="Unknown";
	}
	System.out.println("You were born in " + season);
	System.out.println(month);
}
	
	
}
