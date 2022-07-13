package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.CabDriver;

@RestController
@RequestMapping(path = "/client")
public class ClientController {
	
	@Autowired
	private RestTemplate template;
	
	@GetMapping(path = "/drivers")
	public String getDrivers() {
		return this.template.getForObject("http://CAB-DRIVER-SERVICE/api/v1/drivers",
				String.class);
	}
	
	@GetMapping(path="/drivers/json")
		public CabDriver[] getDriversAsJson() {
			return this.template.getForObject("http://CAB-DRIVER-SERVICE/api/v1/drivers/",
					CabDriver[].class);
		
	}
	

	@GetMapping(path="/srch/drivers/{name}")
	public String getDriverByName(@PathVariable("name") String name){
		return this.template.getForObject("http://CAB-DRIVER-SERVICE/api/v1/drivers/srch/"+name, String.class);
		
	}

}
