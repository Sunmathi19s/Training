package com.training;
import java.util.*;

import com.training.exception.RangeCheckException;
import com.training.model.Student;
import com.training.services.ExceptionHandling;
import com.training.services.StudentService;

public class Application {

	public static void main(String[] args) {
		
		Student ram=null;
		try {
			ram = new Student(1010,"ramesh",-98);
		} catch (RangeCheckException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		StudentService service = new StudentService(ram);
		
		System.out.println(service.sendDetails());
		
		Student magesh = new Student();
		magesh.setFirstName("magesh kumar");
		magesh.setMarkScored(56);
		// TODO Auto-generated method stub
   	System.err.println("Name is not passed");
		//e.printStackTrace();
		
		ExceptionHandling exHAndling = new ExceptionHandling();
	//	exHAndling.usingArrayIndexException(args);
		//exHAndling.usingNumberFormatException("45");
		exHAndling.usingFinallyBlock();
		try {
			System.out.println(exHAndling.underFinallyBlock());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	//since we are using try with resource - Scanner will be closed
	try (Scanner scan = new Scanner(System.in)){
		System.out.println("Enter Number");
		int num = scan.nextInt();
		System.out.println(num);
	}catch (Exception e) {
	e.printStackTrace();

	}
	}
}
