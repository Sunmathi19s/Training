package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.HealthInsurance;
import com.example.demo.entity.LifeInsurance;
import com.example.demo.service.InsuranceService;

@SpringBootApplication
public class TablePerSubClassHierarchyApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx =
				SpringApplication.run(TablePerSubClassHierarchyApplication.class, args);
		
		InsuranceService service = ctx.getBean(InsuranceService.class);
		
		service.addHealthPolicy();
		service.addLifepolicy();
	}

	@Bean
	public LifeInsurance life() {
		return new LifeInsurance(8956382,"deekshith",23,"it services");
	}
	
	@Bean
	public HealthInsurance health() {
		return new HealthInsurance(4558909,"Andrew",49,"diabetic");
	}


}
