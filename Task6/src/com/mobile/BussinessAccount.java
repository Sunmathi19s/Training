package com.mobile;

public class BussinessAccount extends BankAccount {
	public BussinessAccount(double balance,String accountHolder) {
	super (balance,accountHolder);
	}
	
	@Override
	public double deposit(double amount) {
		double balance = getBalance()+amount;
		setBalance(balance);
		// TODO Auto-generated method stub
		return balance;
	}

	@Override
	public double withdraw(double amount) {
		// TODO Auto-generated method stub
		return 0;
	}

	

}
