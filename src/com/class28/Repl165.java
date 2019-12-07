package com.class28;

import java.util.Scanner;

public class Repl165 {
	final void m1() {
		Scanner scan = new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		
		a=a+b;//22
		b=a-b;//12
		a=a-b;//10
		
		System.out.println("a is now assigned value of "+a);
		System.out.println("b is now assigend value of "+b);
	}
	public static void main(String[] args) {
		Repl165 rev = new Repl165();
		rev.m1();
	}
}
