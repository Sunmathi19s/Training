package com.example.demo.service;

import java.net.URI;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.demo.entity.Driver;


@RestController
@RequestMapping(path = "/api/v1")
public class DriverController {
	
	@Autowired
	private DriverService service;

	public DriverController(DriverService service) {
		super();
		this.service = service;
	}
	
	
	//-----------find all-----------
	@GetMapping(path = "/drivers")
	public List<Driver> getAllDrivers(){
		return this.service.findAll();
	}
	
	
	//-----------find by id----------
	//shortcut for request mapping
	
	@GetMapping(path = "/drivers/{id}")
	public Driver getDriverById(@PathVariable("id") int id){
		return this.service.findById(id);
		
	}
	
	
//	@PostMapping(path ="/drivers")
//	public Driver addDriver (@RequestBody Driver entity) {
//		return this.service.add(entity);
//	}

	//------------add--------
	@PostMapping(path ="/drivers")
	public ResponseEntity<Driver>addDriver (@RequestBody Driver entity) {
		
		Driver driver = this.service.add(entity);
		
		//uri inbuild java class(import uri.net.java
		
		URI location = ServletUriComponentsBuilder
				.fromCurrentRequest()  // =>   http://localhost:8080/drivers
				.path("/{id}")         // =>   http://localhost:8080/drivers/{id}
				.buildAndExpand(entity.getDriverId())   //=>http://localhost:8080/drivers/103
				.toUri();
		
		
		return ResponseEntity.status(201).body(driver);
	}

	
	//----------------delete- by giving body in postman---------
	
//      @DeleteMapping(path="/drivers")
//
//	
//	public ResponseEntity<Object> remove(@RequestBody Driver entity) {
//
//	Driver result = this.service.remove(entity);
//
//	    if(result !=null) {
//	    	return ResponseEntity.status(204).build();
//	    	}else {
//	    		return ResponseEntity.ok("No Record Matching");
//	    	}
//
//	}
      
      //--------------------delete by id in post man--------------
      @DeleteMapping(path="/drivers/{id}")

  	
  	public ResponseEntity<Integer> remove(@PathVariable("id") int id) {

  	Integer driver = this.service.remove(id).orElseThrow(()->
  	new NoSuchElementException("Element not found"));

  	     return ResponseEntity.ok().body(driver);

  	}
  			
	
}
	
	
	
