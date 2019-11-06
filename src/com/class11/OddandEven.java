package com.class11;

public class OddandEven {

	public static void main(String[] args) {
		
//		Create a 2D array or integer type where you will store odd and even numbers in 3 rows and 4 columns. 
//		Develop a program which will identify/print the even numbers only.
//		
		
		int[][] nums= {
				{2,1,4,6},
				{9,5,7,1},
				{3,6,9,7}
			};
		
		for(int[] is:nums) {
			for(int is2:is) {
				if (is2%2==0) {
					System.out.print(is2+" ");
			}
		
			
		}
		
		
		}	

	}

}
