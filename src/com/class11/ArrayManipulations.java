package com.class11;

import java.util.Arrays;

public class ArrayManipulations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] actualNames = { "John", "Smith", "Alex", "Tanaz" };
		Arrays.sort(actualNames);

		String[] expectedNames = { "Smith", "John", "Alex", "Tanaz" };
		Arrays.sort(expectedNames);

		System.out.println(Arrays.toString(actualNames));

		String actual = Arrays.toString(actualNames);
		String expected = Arrays.toString(expectedNames);

		System.out.println(actual.equals(expected));

		System.out.println(
				"_________________________________________________________________________________________________________________________________________________________________");

		int[] numbers = { 123, 34, 15, 66, 99 };
		Arrays.sort(numbers);
		for (int i : numbers) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("_______________________________________________________________________________________________________________________________________________________");
		
		Arrays.sort(numbers);
        for(int i:numbers) {
  //          System.out.print(i+” “);
        }

	}

}
