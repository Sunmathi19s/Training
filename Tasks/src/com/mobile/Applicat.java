package com.mobile;

public class Applicat {

	public static void main(String[] args) throws InvalidEmailException {
		Customer ram = null;
		try {
			ram=new Customer(78,"rwenu",6789054,"s.sunmath@19gmail.com");
		}catch(InvalidEmailException e) {
			e.printStackTrace();
		}
		System.out.println(ram.getEmail()  +" is valid mail");
		// TODO Auto-generated method stub

	}

}
