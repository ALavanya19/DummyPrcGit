package com.OOPs;

public class SavingAccount extends AbBankAccount{

	public SavingAccount(String accountNumber, double balance) {
		super(accountNumber, balance);
	}

	@Override
	public void deposit(Double depositAmount) {
		System.out.println("Deposit Amount is : "+depositAmount);
		System.out.println("Deposit "+depositAmount+"Successful. Current Balance is : "+(getBalance()+depositAmount));
		setBalance((getBalance()+depositAmount));
	}

	@Override
	public void withdraw(Double withdrawAmount) {
		System.out.println("Withdraw Amount is : "+withdrawAmount);
		if(getBalance()>=withdrawAmount) {
			setBalance(getBalance()-withdrawAmount);
			System.out.println("Withdraw "+withdrawAmount+"successfull. Current Balance is : "+getBalance());
		}
		else
		{
			System.out.println("Sufficient Balance is not Available");
		}
		
	}

	
}
