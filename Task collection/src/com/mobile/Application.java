package com.mobile;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Patient p1 = new Patient(01,"ram","navalur",902345981);
		Patient p2 = new Patient(01,"shyam","OMR",902345981);
		Patient p3 = new Patient(01,"deep","nilangarai",902345981);
		
		Set<Patient> patients = new HashSet<>();
		patients.add(p1);
		patients.add(p2);
		patients.add(p3);
		
		Doctor doctor = new Doctor(908,"Mani","ENT",patients);
	System.out.println(doctor.getDoctorName());
		System.out.println(doctor.getDepartment());
		
		

        for(Patient eachPatient :doctor.getPatients()) {
        	System.out.println(eachPatient);
        }
        
       
    
        
        
      
	}

}
