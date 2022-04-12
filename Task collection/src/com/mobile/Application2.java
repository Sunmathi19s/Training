package com.mobile;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Application2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Patient p1 = new Patient(01,"ram","navalur",902345981);
		Patient p2 = new Patient(02,"shyam","OMR",902345981);
		Patient p3 = new Patient(03,"deep","nilangarai",902345981);
		
		Set<Patient> patients = new HashSet<>();
		patients.add(p1);
		patients.add(p2);
		patients.add(p3);
		
		Doctor doctorMani = new Doctor(908,"Mani","ENT",patients);
		Doctor doctorVani = new Doctor(900,"vani","PNT",patients);
		Map<Doctor,Set<Patient>> list = new HashMap<>();
	     list.put(doctorMani,patients);
	     list.put(doctorVani,patients);
	
	 
	  
      Appointment app = new Appointment(list);
      System.out.println(app.getPatient(doctorVani));
      System.out.println(app.getPatient(doctorMani));
     
	}
}

