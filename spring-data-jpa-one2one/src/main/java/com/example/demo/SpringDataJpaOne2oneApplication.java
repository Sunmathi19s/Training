package com.example.demo;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.Seminar;
import com.example.demo.entity.Speaker;

@SpringBootApplication
public class SpringDataJpaOne2oneApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx =
				SpringApplication.run(SpringDataJpaOne2oneApplication.class, args);
		
		SeminarService obj = ctx.getBean(SeminarService.class);
		
		SeminarRepositary rep = ctx.getBean(SeminarRepositary.class);
		
		//obj.create();
		
	List<Seminar> semi =rep.findAll();
		
	System.out.println(semi);
		ctx.close();
	}
	
	@Bean
	public Seminar arun() {
		Seminar sem = new Seminar();
		sem.setId(191);
		sem.setName("arun");
		sem.setDuration(12);
		sem.setSpeaker(akash());
		return sem;
	}
	
	@Bean
	public Speaker akash() {
		return new Speaker(602,"akash",12);
	}

}
