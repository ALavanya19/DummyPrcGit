package com.OOPs;

public class BankAccountDetails{

	public static void main(String[] args) {
		
		String accountNumber="6547893215";
		double balance=1500.0;
		SavingAccount sa=new SavingAccount(accountNumber, balance);
		System.out.println("Current Balance : "+sa.getBalance());
		double depositAmount=15000.0;
		sa.deposit(depositAmount);
		double withdrawAmount=20000.0;
		sa.withdraw(withdrawAmount);

	}

}
