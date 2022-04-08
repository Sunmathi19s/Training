package com.training;

import java.security.Provider.Service;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	CreditCardService service = new CreditCardService();
    	CreditCard credit1 = new CreditCard(34,"ram",300);
    	CreditCard credit2 = new CreditCard(46,"sam",890);
    	CreditCard credit3 = new CreditCard(04,"jam",570);
    	CreditCard credit4 = new CreditCard(74,"kam",3450);
    	
    	System.out.println(credit1.toString());	
    	System.out.println(service.addCard);
    	
    }
}
