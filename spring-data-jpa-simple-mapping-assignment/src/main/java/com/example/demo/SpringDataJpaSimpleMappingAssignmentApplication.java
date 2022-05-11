package com.example.demo;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.Employee;

@SpringBootApplication
public class SpringDataJpaSimpleMappingAssignmentApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx= SpringApplication.run(SpringDataJpaSimpleMappingAssignmentApplication.class, args);
		
	//	Employee deekshith = ctx.getBean(Employee.class);
		
		EmployeeService service = ctx.getBean(EmployeeService.class);
		
	

//			//----------find by DOB -------------
//		service.findByDateOfBirth(LocalDate.of(2000, 10, 19)).forEach(System.out::println);
		
		
		
		
		
		//-----------find by location-------------
		
		service.findByLocation("navalur").forEach(System.out::println);
		
		
		//------------find by skill---------
		
		service.findBySkill("supervisor").forEach(System.out::println);
		
		
		
		
		
		
		
		
		
//		Employee added = service.add(deekshith);
//		
//		if(added!=null) {
//			System.out.println("one row added successfully");
//		}
	}
	
//	@Bean
//	public Employee deekshith(){
//		return new Employee(104,"deekshith",LocalDate.of(2000, 10, 19),"sipcot","manager",90433456);
//	}

}
