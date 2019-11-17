package com.class09;

public class Pattern {

	public static void main(String[] args) {

		for (int i = 1; i <= 4; i++) {

			for (int j = 1; j <= 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println(
				"______________________________________________________________________________________________________________________________________________________________");
		// *******
		for (int i = 0; i < 10; i++) {
			for (int j = 1; j < 9; j++) {
				System.out.print(j);
			}
			System.out.println();
		}

		System.out.println(
				"____________________________________________________________________________________________________________________________________________________");
		/*
		 * 123456789 123456789
		 */

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.print(j);
			}
			System.out.println();

		}
		System.out.println(
				"_______________________________________________________________________________________________________________________________________________________");
		for (int i = 0; i <= 4; i++) {
			for (int j = 5; j >= 1; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println(
				"___________________________________________________________________________________________________________________________________________________");
		for (int i = 5; i >= 1; i--) {
			for (int j = 0; j <= 4; j++) {
				System.out.print(i);
			}
			System.out.println();
		}

	}
}
