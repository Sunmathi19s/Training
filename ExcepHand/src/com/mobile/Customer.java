package com.mobile;

public class Customer {
	private int customerId;
	private String customerName;
	private double phoneNum;
	private String email;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(int customerId, String customerName, double phoneNum, String email) {
		super();
		if(email.contains("@")&& email.contains(".com")|| email.contains(".in") || email.contains(".org")) {
		}else {
			try {
				throw new InvalidEmailException("mail must contain @,.in,.com,.org");
			}catch (InvalidEmailException e){
				e.printStackTrace();
			}
		}
		this.customerId = customerId;
		this.customerName = customerName;
		this.phoneNum = phoneNum;
		this.email = email;
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
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public double getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(double phoneNum) {
		this.phoneNum = phoneNum;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email)throws InvalidEmailException {
		if(email.contains("@")&& email.contains(".com")|| email.contains(".in") || email.contains(".org")) {
		this.email = email;
	}else {
		throw new InvalidEmailException("mail must contain @,.com,.in,.org");
	}
	}
	
	

}

