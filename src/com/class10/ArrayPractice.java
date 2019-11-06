package com.class10;

public class ArrayPractice {
	public static void main(String[] args) {
		char[] grade = new char[6];
		grade[0] = 'A';
		grade[1] = 'B';
		grade[2] = 'C';
		grade[3] = 'D';
		grade[4] = 'E';
		grade[5] = 'F';

		System.out.println(grade[1]);

		for (int i = 0; i < grade.length; i++) {
			System.out.println(grade[i]);
		}

		System.out.println(
				"________________________________________________________________________________________________________________________________________________________________");
		char[] array = { 'A', 'B', 'C', 'D', 'E', 'F' };
		System.out.println(array[1]);
		System.out.println(
				"________________________________________________________________________________________________________________________________________________________________");

		String[] name = new String[6];
		name[0] = "Analia";
		name[1] = "Yuliia";
		name[2] = "Gaukhar";
		name[3] = "Abdil";
		name[4] = "David";
		name[5] = "Jaime";

		System.out.println(name[5]);

		String[] names = { "Analia", "Yuliia", "Gaukhar", "Abdil", "David", "Jaime" };

		System.out.println(names[5]);
		System.out.println(
				"_________________________________________________________________________________________________________________________________________________________________");

		String[] word = new String[5];
		word[0] = "Java";
		word[1] = "Saturday";
		word[2] = "day";
		word[3] = "coding";
		word[4] = "is";

		System.out.println(word[1] + " " + word[4] + " " + word[0] + " " + word[3] + " " + word[2]);

		String[] animals = { "Cat", "Dog", "Cow", "Snake", "Elephant" };
		int size = animals.length;

		for (int i = 0; i < size; i++) {
			System.out.print(animals[i] + " ");
			System.out.println(
					"______________________________________________________________________________________________________________________________________________________________");

			// create an array to store 5 double values, print all in 1 line
			double[] val = { 1.5, 2.5, 3.5, 4.5, 5.5 };
			int num = val.length;

			for (int j = 0; j < num; j++) {
				System.out.println(val[j]);
			}
				

		}

	}

}
