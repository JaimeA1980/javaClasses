package com.class5;

import java.util.Scanner;

public class QuizTask {
	
	public static void main(String[] args) {
		
		Scanner scan;
		int quiz, midTerm, finalScore, average;
		
		scan=new Scanner(System.in);
		System.out.println("Please enter quiz score");
		quiz=scan.nextInt();
		
		System.out.println("Please enter mid term score");
		midTerm=scan.nextInt();
		
		System.out.println("Please enter final score");
		finalScore=scan.nextInt();
		
		average=(quiz+midTerm+finalScore)/3;
		
		if (average>=90) {
			System.out.println("A");
		}else if (average>=70 && average<90) {
			System.out.println("B");
		}else if (average>=50 && average<70) {
			System.out.println("C");
		}else if (average<50) {
			System.out.println("D");
		}else {
			System.out.println("Unknown");
		}
		
		
		
		
		
	}

}