package com.training.ifaces;

public class Student implements Conditional {
	private int markScored;

	@Override
	public boolean test(Object value) {
		String strBranch=(String)value;
		boolean result=false;
		if(this.markScored>80 && strBranch.equalsIgnoreCase("ece")) {
			result=true;
		}
		return result;
	
		
		// TODO Auto-generated method stub
		
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int i) {
		// TODO Auto-generated constructor stub
	}

	public int getMarkScored() {
		return markScored;
	}

	public void setMarkScored(int markScored) {
		this.markScored = markScored;
	
		
		
		
		
	}

}
	

