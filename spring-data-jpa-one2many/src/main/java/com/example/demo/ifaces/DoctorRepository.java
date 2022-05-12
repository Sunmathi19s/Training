package com.example.demo.ifaces;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Doctor;

public interface DoctorRepository extends JpaRepository<Doctor, Integer> {
	
	//public List<Doctor> findByPatientId (int patientId);
	

}
