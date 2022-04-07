package com.mobile;

public class SavingsAccount extends BankAccount {

	
	public SavingsAccount(double balance, String accountHolder) {
		super(balance, accountHolder);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double deposit(double amount) {
		// TODO Auto-generated method stub
		double balance = getBalance()+amount;
		setBalance(balance);
		return balance;
	}

	@Override
	public double withdraw(double amount) {
		double balance = getBalance()-amount;
		setBalance(balance);
		return balance;
		// TODO Auto-generated method stub
	
	}

	
}
