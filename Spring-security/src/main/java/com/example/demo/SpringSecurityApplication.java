package com.example.demo;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
@EnableWebSecurity 
public class SpringSecurityApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(SpringSecurityApplication.class, args);
		
		BCryptPasswordEncoder encoder = ctx.getBean(BCryptPasswordEncoder.class);
				System.out.println(encoder.encode("india"));
		System.out.println(encoder.encode("nepal"));
						
						
						
						
	}
	
	@Bean
	BCryptPasswordEncoder encoder() {
	
		return new BCryptPasswordEncoder();
	}

}
