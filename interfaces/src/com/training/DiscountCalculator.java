package com.training;

import com.training.ifaces.Condition;

public class DiscountCalculator implements Condition {

	@Override
	public boolean test(int value) {
		// TODO Auto-generated method stub
		return value>500;
	}

	@Override
	public boolean negate(int value) {
		// TODO Auto-generated method stub
		return value<500;
	}

}