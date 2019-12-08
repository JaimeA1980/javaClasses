package com.class31;

public class Account {
	private long accountNumber;
	private double balance;
	//getters - give read only access
	public long getAccountNumber() {
		return accountNumber;
	}
	public double getbalance() {
		return balance;
	}
	//setters - give write access
	public void setBalance(int amount) {
		if (amount>0) {
			balance+=amount;
		}
	
	}
	public void setAccountNumber(long accountNumber) {
		if (String.valueOf(accountNumber).length()==9){
			this.accountNumber=accountNumber;
			
		}
		
	}
}
