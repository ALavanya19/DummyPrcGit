package com.OOPs;

public abstract class AbBankAccount {
       
	
	private String accountNumber;
	private double balance;
	
	public AbBankAccount(String accountNumber, double balance) {
		this.accountNumber=accountNumber;
		this.balance=balance;
	}
	
	public String getAccountNumber() {
		return accountNumber;
		
	}
	
	public void setBalance(Double balance) {
		this.balance=balance;		
	}
	
	public double getBalance() {
		return balance;
	}
	
	public abstract void deposit(Double depositAmount);
	public abstract void withdraw(Double withdrawamount);
		
}


