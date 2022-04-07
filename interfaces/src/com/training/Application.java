package com.training;

import com.training.ifaces.CheckCondition;
import com.training.ifaces.Condition;
import com.training.ifaces.Function;
import com.training.services.CurrencyConverter;

//A class can only extend another class not interfaces

//class Dumy extends Function{
//
//}

public class Application {

	public static void main(String[] args) {
		//subtype  = new subtype
		//CurrencyConverter conv = new CurrencyConverter();
		
		Function conv = new CurrencyConverter();

		
		double response = conv.apply(200);
		System.out.println(Function.Counter);
		
		System.out.println(response);
		
		//line 11, 13 &&16 are identical
		System.out.println(conv.apply(300));
		
		if(conv instanceof CheckCondition) {
			CheckCondition obj = (CheckCondition)conv;
		
		
		System.out.println("IS Discount Allowed:="+obj.test(300));
		
		Condition condObj = new DiscountCalculator();
		
		System.out.println(condObj.test(6000));
		System.out.println(condObj.negate(6000));
		
		}
		
		

	}

}
