package com.training.model;

import com.training.ifaces.Conditional;

public class Prinicipal implements Conditional {
	private String typeOfCollege;

	public Prinicipal() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public Prinicipal(String typeOfCollege) {
		super();
		this.typeOfCollege = typeOfCollege;
	}

	public String getTypeOfCollege() {
		return typeOfCollege;
	}

	public void setTypeOfCollege(String typeOfCollege) {
		this.typeOfCollege = typeOfCollege;
	}

	@Override
	public boolean test(Object value) {
		String strLocation = (String)value;
		
		boolean result = false;
		
		if(this.typeOfCollege.equals("engg") &&  strLocation.equals("rural")) {
			result = true;
		}
		// TODO Auto-generated method stub
		return result;
	}

}
