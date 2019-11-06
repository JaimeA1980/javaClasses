package com.class11;

public class TwoDArraysCont {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] numbers= {
				{8,7,5,3,8},
				{1,5,6,4,9},
				{3,6,8,0,7}
		};
		
	
		for (int i=0;i<numbers.length;i++) {
			for(int j=0; j<numbers[i].length; j++) {
				System.out.print(numbers[i][j]*2+" ");
			}
			System.out.println();
		}


	}

}
