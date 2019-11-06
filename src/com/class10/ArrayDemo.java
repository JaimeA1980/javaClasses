package com.class10;

public class ArrayDemo {
	public static void main(String[] args) {

		int[] nums = new int[4]; // 2147483647 is the max number for in range, if the new int is [5], it would
									// still print 5 in the console, if [3] its out of bounds
		nums[0] = 12;
		nums[1] = 13;
		nums[2] = 14;
		nums[3] = 15;
		// to find # of elements we use .length
		System.out.println(nums.length);
		System.out.println(
				"________________________________________________________________________________________________________________________________________________________________");
		// 0 1 2 3
		String[] array = { "Winter", "Fall", "Summer", "Spring" };
		// I was born in summer
		System.out.println("I was born in " + array[2]);
		
		//array.length will return an integer
		int arraySize= array.length;
		System.out.println(arraySize);
		
		int[] score= {80,90,70,100,99};
	}
}
