package com.class28;

import java.util.Scanner;

//For you to do
//
//Create a final method and name it reverseString with a return type of String. when you call the method and enter the string parameter, 
//the method should return my string. implement a scanner class to reverse the string.
//
//Input:
// hello
//
//Output:
//olleh
//
public class Main {
	public final String reverseString() {
		Scanner scan = new Scanner(System.in);
		String word1 = scan.nextLine();
				String word2 ="";
				for (int i = word1.length()-1; i>=0; i--) {
					word2+=word1.charAt(i);
				}
		return word2;
	}
	public static void main(String[] args) {
		Main main = new Main();
		System.out.println(main.reverseString());
	}

}
