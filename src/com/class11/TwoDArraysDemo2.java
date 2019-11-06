package com.class11;

public class TwoDArraysDemo2 {

	public static void main(String[] args) {
		
		String [][] names= {
				{"Khan","Yousuf","Alex","Zynab"},
				{"Mo","Ann","Naslyhan","Weqas"},
				{"Diego","Arif","Zubair","Shogofa"}
				
		};
		
		//int length=names.length;
		//System.out.println(length);
		
		int lengthOfRows=names.length;
		System.out.println(lengthOfRows);
		
		int lengthOfColumns=names[1].length;
		System.out.println(lengthOfColumns);
		
		for (String getArrays[]: names) {
			for(String getName: getArrays) {
				System.out.print(getName+" ");
			}
			System.out.println();
		}
	}

}
