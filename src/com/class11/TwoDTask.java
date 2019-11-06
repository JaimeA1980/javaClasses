package com.class11;

public class TwoDTask {
	public static void main(String[] args) {
		
		//Create a 2D array of integer type with 3 rows and 4 columns
		// and print all values of the whole array
		
		int[] []array= {
				{12,81,10,5},
				{8,95,23,55},
				{2,4,5,6}
							
		};
		for (int i=0; i<array.length; i++) {
			for (int j=0;j<array[i].length; j++) {
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
				
			}
		
		
		
		
		
	}

}
