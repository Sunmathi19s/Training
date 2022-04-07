package com.training;
import com.training.model.BankAccount;
import com.training.services.BankAccountService;
import java.util.*;
public class MyApplication {

	public static void main(String[] args) {
		BankAccountService service = new BankAccountService();
		BankAccount[] list=new BankAccount[2];
		int i=0;
		int choice=0;
		Scanner sc = new Scanner(System.in);
		do{
			BankAccount ac= new BankAccount();
			      System.out.println("accountNumber");
				  int accountNumber= sc.nextInt();
				  System.out.println("Account holder name");
			      String accountHolderName= sc.next();
			      System.out.println("balance");
			      double balance=sc.nextDouble();
			      System.out.println("Account Type [savings,fixed,recurring]");
			      String accountType=sc.next();
				  BankAccount account=new BankAccount(accountNumber,accountHolderName,balance,accountType);
					       
				  list[i]=account;
			      i++;
			      System.out.println("continue or not");
			      choice=sc.nextInt();
			       
			     
		}while(choice==0);
		
		
			service.findInterest(list);
	  sc.close();	
	}

}