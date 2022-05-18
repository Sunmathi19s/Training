package com.example.demo;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.http.client.support.BasicAuthenticationInterceptor;
import org.springframework.web.client.RestTemplate;

import com.example.demo.model.Driver;

@SpringBootApplication
public class DriverServiceClientApplication {

	public static void main(String[] args) {
	ConfigurableApplicationContext ctx =	SpringApplication.run(DriverServiceClientApplication.class, args);
		
	Client client = ctx.getBean(Client.class);
	
	System.out.println(client.invokeGetAll());
	
//	Driver[] list = client.invokeAllAsObject();
//	
//	for(Driver eachDriver:list) {
//		
//	System.out.println("driverId :=" +eachDriver.getDriverId());
//	System.out.println("driverName :=" +eachDriver.getDriverName());
//	System.out.println("mobileNumber :=" +eachDriver.getMobileNumber());
//	System.out.println("rating :=" +eachDriver.getRating());
//	}
	
	
	
	
	//client.add();
	
	
	
	ctx.close();
		
	}
	@Bean
	public BasicAuthenticationInterceptor interceptor() {
		return new BasicAuthenticationInterceptor("nepal", "nepal");
	}
	
	@Bean
	public RestTemplate template() {
		RestTemplate template = new RestTemplate();
		
		template.getInterceptors().add(interceptor());
		return template;
	}
	
	

}
