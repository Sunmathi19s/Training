package com.mobile;

public class Application {

	public static void main(String[] args) {
		SavingsAccount ram = new SavingsAccount(1000,"ragy");
		ram.deposit(5000);
		ram.withdraw(3000);
		
		System.out.println(ram.getBalance());
		ram.deposit(150000);
		System.out.println(ram.getBalance());
		
		BussinessAccount ragu = new BussinessAccount(10000,"tom");
		ragu.deposit(2000);
		ragu.withdraw(1000);
		
		//System.out.println(ragu.deposit());
		System.out.println(ragu.getBalance());
		
		// TODO Auto-generated method stub

	}

}
