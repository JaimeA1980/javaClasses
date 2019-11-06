package com.class5;

public class LogicalAnd {

	public static void main(String[] args) {
		/*if number is between 1-10--->this number is small
		 * if number is between 10-100---> this number is medium
		 * if nyumber is between 100-1000---> this number is large
		 * any other number--->if out of the range
		 */

		int num=2;
		// true AND false---> false
		if (num>1 && num<10) {
			System.out.println("This number is small");
			// true AND false --> false
		}else if (num>=10 && num<100) {
			System.out.println("This number is medium");
			//true AND true -->true
		}else if (num>=100 && num<1000) {
			System.out.println("This number is large");
		} else {
			System.out.println("Number is out of the range");
		}
	}

}
