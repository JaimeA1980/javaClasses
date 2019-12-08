package com.class31;

public class AccountTest {
	public static void main(String[] args) {
		Account acc = new Account();
		acc.setAccountNumber(12345678);//account number does not meet condition...should be 9 numbers, or it will return 0
		long accountNum = acc.getAccountNumber();
		System.out.println(accountNum);
		
		acc.setBalance(-200);
		double myBalance = acc.getbalance();
		System.out.println(myBalance);
		
		int num = 123;
		String.valueOf(num);//converts given value to String
	}

}
