package com.training.model;

public class HealthInsurance1 extends Insurance { 
	private String[] preExistingDisease;

	

	public HealthInsurance1(int policyNumber, String policyHolderName, String[] preExistingDisease) {
		super(policyNumber, policyHolderName);
		this.preExistingDisease = preExistingDisease;
	}


	public HealthInsurance1() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public double calculatePremium() {
		
		double premium = 1000;
		for(String eachItem : preExistingDisease) {
			String item = eachItem.toLowerCase();
			if(eachItem.equals("BP") || eachItem.equals("sugar")) {
				premium = 15000;
			}
		}
			
		// TODO Auto-generated method stub
		return premium;
	}

	private Object preExistingDisease() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
