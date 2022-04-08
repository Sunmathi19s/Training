package com.mobile;

public class Application {
	
	
	
	public static void main(String[] args) {
		
		Address address = new Address("OMR", "Chennai", 603103);
		
		System.out.println(address.toString());
		
		MobileBill bill = new MobileBill("sunmathi", 767857647, "prepaid", address);
		
		System.out.println(bill.getCustomerName());
		System.out.println(bill.getMobileNumber());
		System.out.println(bill.findAmount());
		
//		MobileBill mobile = new MobileBill("janu",78569323,"prepaid");
//		System.out.println("customer name:"+mobile.getCustomerName());
//		System.out.println("mobilnumber:"+mobile.getMobileNumber());
//		System.out.println("plan name:"+mobile.getPlanname());
		// TODO Auto-generated method stub
		
//		Address address = new Address();
//		System.out.println(address.getDoornum());
//		System.out.println(address.getArea());
//	    System.out.println(address.getPincode());
		

	}

}