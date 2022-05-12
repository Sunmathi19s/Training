package com.example.demo.utils.bidirection;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import com.example.demo.entity.bidirectional.*;
import com.example.demo.ifaces.bidirectional.*;


@Component
public class Utility {
	
	@Autowired
	List<Patient> patientList;
	
	@Autowired
	Doctor doc;
	
	@Autowired
	DoctorRepository repo;
	
	@Autowired
	PatientRepository patientRepo;
	
	public void create() {
		doc.setPatientList(patientList);
		Doctor added=repo.save(doc);
		if(added!=null) {
			System.out.println("One Recored added");
		}
	}
	public void findAll() {
		List<Doctor> doctors=repo.findAll();
		for(Doctor eachDoctor:doctors) {
			System.out.println("DoctorName");
			System.out.println("Department := "+eachDoctor.getDepartment());
			List<Patient> patients=eachDoctor.getPatientList();
			for(Patient eachPatient:patients) {
				System.out.println("patient Name:="+eachPatient.getPatientName());
				System.out.println("Patient Number:= "+eachPatient.getMobileNumber());
			}
		}
	}
	
	public void findDoctorFrmPatient() {
		Patient entity = patientRepo.findById(200).get();
		System.out.println(entity.getPatientName());
		System.out.println(entity.getDoctor());
		
	}

}
