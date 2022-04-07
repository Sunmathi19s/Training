package com.training;

import com.training.model.BankAccount;
import com.training.model.SavingsAccount;
import com.training.services.BankAccountService;

public class SavingsAccountService extends BankAccountService {
	public String getCustomerInfo(SavingsAccount account) {
		return account.getAccountHolderName();
	}

	@Override
	public double calculateInterest(BankAccount account) {
		double simpleInterest = 0.10;
		if(account.getAccountNumber()<=5000) {
			simpleInterest = 0.20;
		}
		// TODO Auto-generated method stub
		return account.getBalance()*1*simpleInterest;
	}

}
