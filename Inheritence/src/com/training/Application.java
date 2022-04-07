package com.training;

import com.training.model.BankAccount;

import com.training.model.SavingsAccount;
import com.training.services.BankAccountService;

public class Application {

	public static void main(String[] args) {
		
		BankAccount ramsaccount = new BankAccount(1010,"Ramesh",50000,"savings");
//		
	System.out.println(ramsaccount);
		// TODO Auto-generated method stub
		SavingsAccount account = new SavingsAccount(650,"ramesh",1000,"joimt","rajesh");
		System.out.println(account.getAccountHolderName());
		System.out.println(account.getNominee());
		
		SavingsAccountService service = new SavingsAccountService();
		System.out.println(service.getCustomerInfo(account));
		
		System.out.println(service.calculateInterest(account));
		
		BankAccountService service2 = new SavingsAccountService();
		//cannot access the subclass method with super class reference
		// service.getcustomerInfo(account);
		
		SavingsAccountService savingService2 = (SavingsAccountService)service2;
		
		
		System.out.println(savingService2.getCustomerInfo(account));
		
	}

}
