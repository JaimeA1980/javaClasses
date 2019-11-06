package com.class6;

import java.util.Scanner;

public class HwOct6Pt3 {
	public static void main(String[] args) {

		String country, nativeLanguage;
		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter your country of origin");
		country = scan.nextLine();

		switch (country) {

		case "Honduras":
			nativeLanguage = "Spanish";
			break;

		case "Suriname":
			nativeLanguage = "Dutch";
			break;
		default:
			nativeLanguage = "Unknown";

		}
		System.out.println("Your country of origin is " + country + " and your native tongue is " + nativeLanguage);

	}

}
