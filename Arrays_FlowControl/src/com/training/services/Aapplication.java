package com.training.services;

import com.training.model.BankAccount;

public class Aapplication {

	public static void main(String[] args) {
		BankAccountService service = new BankAccountService();
		
		BankAccount ram = new BankAccount(5000,"Ramesh",5000);
		
		double simpleInterest = service.calculateInterest(ram);
		
		System.out.println("simple Interse:="+ simpleInterest);
		
        BankAccount shyam = new BankAccount(6200,"Rajesh",5000);
		
		double simpleInterest2 = service.calculateInterest(shyam);
		
		System.out.println("simple Interse:="+ simpleInterest2);
		
//		BankAccount[] accounts = new BankAccount[2];
//		
//		accounts[0] = ram;
//		accounts[1] = shyam;
//		
//		service.calculateInterest(accounts);
		// TODO Auto-generated method stub
		
		BankAccount[] accounts = {ram,shyam};
		service.calculateInterest(accounts);
		System.out.println("===Array=====");
		
		
		double[] values = service.findInterest(accounts);
		for(double eachvalue:values) {
			System.out.println( eachvalue );
		
		}
		
		BankAccount[] accountlist = {
				new BankAccount(800,"jay",5000,"savings"),
				new BankAccount(801,"kam",6000,"fixed"),
				new BankAccount(802,"tom",7000,"recurring"),
		};
		double[] interestvalues = service.findInterestBYAccountType(accounts);
		
		for (double eachvalue : interestvalues) {
			System.out.println(eachvalue);
		}
 
	}

}