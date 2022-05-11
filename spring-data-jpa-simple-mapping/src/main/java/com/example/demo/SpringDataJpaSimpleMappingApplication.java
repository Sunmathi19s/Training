package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

import com.example.demo.entity.Doctor;
import com.example.demo.repo.DoctorService;

@SpringBootApplication
public class SpringDataJpaSimpleMappingApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = 
				SpringApplication.run(SpringDataJpaSimpleMappingApplication.class, args);
		
//		Doctor siva = ctx.getBean(Doctor.class);
//		Doctor mani = ctx.getBean(Doctor.class);
//		Doctor vani = ctx.getBean(Doctor.class);
//		Doctor rani = ctx.getBean(Doctor.class);

		
		DoctorService service = ctx.getBean(DoctorService.class);
		
//		Doctor added = service.add(siva);
//	
//		
//		if(added!=null) {
//			System.out.println("One Doctor Added");
//		}
		//-------------findall===========
		//service.findAll().forEach(System.out::println);
		
		//-------------findbydept----------
		//service.findByDept("ent").forEach(System.out::println);
		
		//----------findByDoctorName----------
		//service.findByName("rani").forEach(System.out::println);
		
		
        //  service.findByNameAndDept("siva", "ent").forEach(System.out::println);
	
		service.findByNameOrDept("rani", "ent").forEach(System.out::println);
		ctx.close();
	}
//	@Bean
//	public Doctor siva() {
//		return new Doctor(2020,"siva","ent",902528329);
//	}
//	@Bean
//	@Primary
//	public Doctor vani() {
//		return new Doctor(2023,"rani","heart",12345600);
//	}

}
