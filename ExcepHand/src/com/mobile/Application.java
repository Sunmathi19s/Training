package com.mobile;

public class Application {

	public static void main(String[] args) {
		Customer ram = null;
		// TODO Auto-generated method stub
		
		 try {
			ram = new Customer(89,"pooja",9876654,"s.sunmathi19@gmail.com");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 System.out.println(ram.getEmail());
  


}
}