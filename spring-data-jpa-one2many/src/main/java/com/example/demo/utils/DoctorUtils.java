package com.example.demo.utils;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Doctor;
import com.example.demo.entity.Patient;
import com.example.demo.ifaces.DoctorRepository;

@Service
public class DoctorUtils {
	
	@Autowired
	List<Patient> patientList;
	
	@Autowired
	Doctor doc;
	
	@Autowired
	DoctorRepository repo;
	
	public void create() {
		doc.setPatientList(patientList);
		
		Doctor added = repo.save(doc);
		
		if(added != null) {
			System.out.println("one record added");
		}
	}

	public void findAll() {
		
		List<Doctor> doctors = repo.findAll();
		
		for(Doctor eachDoctor:doctors) {
			System.out.println("Doctor Name :="+eachDoctor.getDoctorName());
			System.out.println("Department :="+eachDoctor.getPatientList());
		
		
			List<Patient> patients = eachDoctor.getPatientList();
			for(Patient eachPatient:patients) {
				System.out.println("patient Name:="+eachPatient.getPatientName());
				System.out.println("Patient Number:= "+eachPatient.getMobileNumber());
		}
		
	}
	}
	
//	public void findById() {
//		
//		List<Doctor> doctors =repo.findByPatientId(id);
//	}
}
