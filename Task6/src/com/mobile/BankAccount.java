package com.mobile;

public abstract class BankAccount {
	private double balance;
	private String accountHolder;

	
	
	public abstract double deposit(double amount );
	public abstract double withdraw (double amount);
	public BankAccount() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BankAccount(double balance, String accountHolder) {
		super();
		this.balance = balance;
		this.accountHolder = accountHolder;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getAccountHolder() {
		return accountHolder;
	}
	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}
	
		

}
