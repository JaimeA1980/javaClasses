package com.class25_1;

public class Repl2 {
	public static void fnl(boolean t) {
		System.out.println("Final method with boolean parameter");
	}
	public static void fnl(String str) {
		System.out.println("Final method with String parameter");
	}
	public static void main(String[] args) {
		fnl(true);
		fnl("phrase");
	}
	
}
// this was for repl #157