package com.mobile;

public class Customer {
	private int customerId;
	private String customerName;
	private long phoneNumber;
	private String email;
	public Customer(int customerId, String customerName, long phoneNumber, String email) throws InvalidEmailException {
		super();
		
		if(email.contains("@") &&  email.contains(".com") || email.contains(".org") || email.contains(".in")){
			this.customerId = customerId;
			this.customerName = customerName;
			this.phoneNumber = phoneNumber;
			this.email = email;
		}else {
			try {
				throw new InvalidEmailException("mail must contains @,.com,.in,.org");
			}catch (InvalidEmailException e) {
				e.printStackTrace();
				
			}

		
	}
	

	}	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
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
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) throws InvalidEmailException{
		if(email.contains("@") &&  email.contains(".com") || email.contains(".org") || email.contains(".in")){
		this.email = email;
		}else {
			throw new InvalidEmailException("mail must contains @,.com,.in,.org");
		}
	}

}
	
