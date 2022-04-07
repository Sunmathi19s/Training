package com.example.model;

public class Student {
	private int rollNumber;
	private String firstName;
	private String branch;
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public Student(int rollNumber, String firstName, String branch, double markScored) {
		
		this.rollNumber = rollNumber;
		this.firstName = firstName;
		this.branch = branch;
		this.markScored = markScored;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	private double markScored;
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public double getMarkScored() {
		return markScored;
	}
	public Student(int rollNumber, String firstName, String branch) {
		this(rollNumber,firstName,branch,99);
		this.rollNumber = rollNumber;
		this.firstName = firstName;
		this.branch = branch;
	}
	public void setMarkScored(double markScored) {
		this.markScored = markScored;
	}
	


}
