package com.example.demo.controllers;

import static java.util.stream.Collectors.toSet;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.CabDriver;
import com.example.demo.TripDetail;
import com.example.demo.dto.TripDto;


@RestController
@RequestMapping(path = "/client")
public class ClientController {
	
	@Autowired
	private RestTemplate template;
	
	@Autowired
	private TripDto dto;
	
	
	@GetMapping(path = "/tripdetails")
	public String gettrips() {
		return this.template.getForObject("http://TRIP-DETAIL-SERVICE/api/v1/tripdetails",
				String.class);
	}
	
	
	@GetMapping(path = "/srch/tripdetails/{id}")
	public String getDriverById(@PathVariable("id") int id) {
		return this.template.getForObject("http://TRIP-DETAIL-SERVICE/api/v1/tripdetails/srch/"+id,
				String.class);
	}
	
	
	
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
	

	@GetMapping(path="/driver/trips/{id}")
	public TripDto getDriverTrips(@PathVariable("id")  int id){
		CabDriver driver =  this.template.getForObject("http://CAB-DRIVER-SERVICE/api/v1/drivers/"+id, 
				CabDriver.class);
		TripDetail[] trips = this.template.getForObject("http://TRIP-DETAIL-SERVICE/api/v1/tripdetails/srch/"+id,
				TripDetail[].class);
		
		dto.setDriver(driver);
		
		//-------------in list---------------
		//List<TripDetail> detailSet = Arrays.asList(trips);
		//dto.setTrips(detailSet);
		
		

		//---------------------in set-------------
		Set<TripDetail> detailSet=Arrays.stream(trips).collect(toSet());
			
		dto.setTrips(detailSet);
				
				
		return dto;
	}

}
