package com.training.model;

public class VechileInsurance extends Insurance {
	
	private String vechileModel;
	private int yearOfManufacture;
	


	public VechileInsurance(String vechileModel, int yearOfManufacture) {
		super();
		this.vechileModel = vechileModel;
		this.yearOfManufacture = yearOfManufacture;
	}



	 public String getVechileModel() {
		return vechileModel;
	}



	public void setVechileModel(String vechileModel) {
		this.vechileModel = vechileModel;
	}



	public int getYearOfManufacture() {
		return yearOfManufacture;
	}



	public void setYearOfManufacture(int yearOfManufacture) {
		this.yearOfManufacture = yearOfManufacture;
	}



	public VechileInsurance(int policyNumber, String policyHolderName,  String vechileModel,
			int yearOfManufacture) {
		super(policyNumber, policyHolderName);
		this.vechileModel = vechileModel;
		this.yearOfManufacture = yearOfManufacture;
	}



	@Override
	public double calculatePremium() {
		
		double premium = 1000;
		if(yearOfManufacture<2020 && vechileModel.equals("car")) {
			premium =2000;
		}
		return premium;
	}

}