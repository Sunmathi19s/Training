package com.example.demo;

import org.springframework.boot.SpringApplication;

import com.example.demo.entity.bidirectional.Doctor;
import com.example.demo.entity.bidirectional.Patient;
import com.example.demo.utils.bidirection.Utility;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringDataJpaBidirectionalApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx =
				SpringApplication.run(SpringDataJpaBidirectionalApplication.class, args);
		
		Utility obj = ctx.getBean(Utility.class);
		
		//obj.create();
		//obj.findAll();
		obj.findDoctorFrmPatient();
		
		ctx.close();
	}
	@Bean
	public Doctor sathya() {
		Doctor doc =new Doctor();
		doc.setDoctorId(141);
		doc.setDoctorName("sathya");
		doc.setPhoneNumber(90234567);
		doc.setDepartment("eye");
	
		return doc;
	}
	
	@Bean 
	public Patient tharani() {
		return new Patient(300,"tharani",12345467);
	}
	
	@Bean 
	public Patient pavi() {
		return new Patient(301,"pavithra",997654123);
	}

}
