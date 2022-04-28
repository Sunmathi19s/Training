package com.mobile;

public class Customer {
	
	private int customerId;
	private String customerName;
	private double phoneNumber;
	private int creditScore;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(int customerId,String customerName, double phone_number, int creditScore) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.phoneNumber = phone_number;
		this.creditScore = creditScore;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", phoneNumber=" + phoneNumber
				+ ", creditScore=" + creditScore + "]";
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public double getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public int getCreditScore() {
		return creditScore;
	}
	public void setCreditScore(int creditScore) {
		this.creditScore = creditScore;
	}

}
