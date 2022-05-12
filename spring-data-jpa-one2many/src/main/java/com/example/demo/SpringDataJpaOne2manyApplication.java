package com.example.demo;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.Doctor;
import com.example.demo.entity.Patient;
import com.example.demo.utils.DoctorUtils;
import com.example.demo.utils.bidirection.Utility;

@SpringBootApplication
public class SpringDataJpaOne2manyApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx =
				SpringApplication.run(SpringDataJpaOne2manyApplication.class, args);
		
		//DoctorUtils obj = ctx.getBean(DoctorUtils.class);
		Utility obj = ctx.getBean(Utility.class);
		
	 
		obj.create();
		
		//obj.findAll();
				
		ctx.close();
	}
	
	@Bean
	public Doctor sidhu() {
		Doctor doc =new Doctor();
		doc.setDoctorId(120);
		doc.setDoctorName("sidhu");
		doc.setPhoneNumber(90234567);
		doc.setDepartment("ent");
		return doc;
	}
	
	@Bean 
	public Patient kavi() {
		return new Patient(200,"kavitha",6789890);
	}
	
	@Bean 
	public Patient savi() {
		return new Patient(401,"savitha",12346890);
	}
	
	@Bean 
	public Patient devi() {
		return new Patient(402,"devika",85329890);
	}

}
