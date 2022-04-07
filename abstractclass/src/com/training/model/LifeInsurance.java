package com.training.model;

public class LifeInsurance extends Insurance {
	private int age;

	public LifeInsurance() {
		super();
		// TODO Auto-generated constructor stub
	}



	public LifeInsurance(int policyNumber, String policyHolderName, int age) {
		super(policyNumber, policyHolderName);
		this.age = age;
	}



	public LifeInsurance(int age) {
		super();
		this.age = age;
	}

	@Override
	public double calculatePremium() {
		if(age < 50) {
			return 5000;
		}else {
		  return 1000;
		}
		// TODO Auto-generated method stub
		
	}
	

}
