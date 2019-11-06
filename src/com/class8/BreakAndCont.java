package com.class8;

import java.util.Scanner;

public class BreakAndCont {
	public static void main(String[] args) {

		for (int i = 1; i <= 50; i++) {

			if (i % 3 == 0) {
				continue;
			}
			System.out.println(i);
		}
		System.out.println(
				"----------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		Scanner scan = new Scanner(System.in);
		String card;
		for (int i1 = 1; i1 <= 10; i1++) {
			System.out.println("Are you applying for credit card?");
			card = scan.nextLine();
			if (card.equalsIgnoreCase("Yes")) {
				break;
			}
		}

	}
}