package com.mobile;

public class InvalidEmailException extends Exception {
	private String message;
	
	public InvalidEmailException(String message) {
		super();
		this .message = message;
		
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return super.getMessage();
	}

}



