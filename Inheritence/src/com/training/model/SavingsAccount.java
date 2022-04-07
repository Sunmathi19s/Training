package com.training.model;

public class SavingsAccount extends BankAccount {
	
	private String nominee;
	//whenever sub class constructor is called its super class
	// constructor also called .Even if super() key word is not present

	public SavingsAccount(String nominee) {
		super();
		this.nominee = nominee;
	}

	public SavingsAccount(int accountNumber, String accountHolderName, double balance, String accountType,
			String nominee) {
		super(accountNumber, accountHolderName, balance, accountType);
		this.nominee = nominee;
	}

	public SavingsAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SavingsAccount(int accountNumber, String accountHolderName, double balance, String accountType) {
		super(accountNumber, accountHolderName, balance, accountType);
		// TODO Auto-generated constructor stub
	}

	public SavingsAccount(int accountNumber, String accountHolderName, double balance) {
		super(accountNumber, accountHolderName, balance);
		// TODO Auto-generated constructor stub
	}

	public String getNominee() {
		return nominee;
	}

	public void setNominee(String nominee) {
		this.nominee = nominee;
	}
	
//	public SavingsAccount() {
//		super();
//	System.out.println("constructor of Sub class called");
//	}
//	
//	public SavingsAccount() {
//		super(1020,"ram",5000);
//		System.out.println("constructor of sub class called");
//	}
//	

}
