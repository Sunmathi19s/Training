package com.example;

import com.example.model.*;

public class Application {

	public static void main(String[] args) {
		Student ram = new Student();
		// ram.rollNumber = 101;
		// public method abole to access
		ram.setRollNumber(56020);
		//default method unable to access=>
		//because student class is in com.example.model package
		//and Application is in com.example package
		ram.setFirstName("ram");
		//unable to access because Application is NOT a subclass of a student
		ram.setMarkScored(45);
		//ram.setBranch("BE");
		System.out.println("Roll Number :="+ram.getRollNumber());
		System.out.println("Mark scored :="+ram.getMarkScored());
		System.out.println("Student name :="+ram.getFirstName());
		
		Student shyam = new Student (45,"shanma","it",99);
		
		System.out.println("Roll Number :="+shyam.getBranch());
		System.out.println("Student name");
		
		Student magesh = new Student(988,"subramani","textile");
		
		System.out.println("Roll number :="+magesh.getRollNumber());
		// System.out.println("");

	}

}

