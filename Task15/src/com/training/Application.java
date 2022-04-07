package com.training;

public class Application {

	public static void main(String[] args) {
		
		ObjectFactory factory = new ObjectFactory();
		Automobile marutiobj = factory.getObject(1);
		Automobile toyotoobj = factory.getObject(2);
		
		
		// TODO Auto-generated method stub
		factory.printQuote(marutiobj);
		factory.printQuote(toyotoobj);
		
		

	}

}
