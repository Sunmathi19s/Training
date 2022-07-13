package com.example.demo.controllers;

import java.util.List;
import java.util.NoSuchElementException;

import org.aspectj.lang.annotation.DeclareError;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.RuntimeBeanNameReference;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.CabDriver;
import com.example.demo.service.CabDriverService;

@RestController
@RequestMapping(path="/api/v1/drivers")
public class CabDriverController {
	
	@Autowired
	private CabDriverService service;
	
	//-------------injecting the port-------------
	//-----------it give a value where its store-----------
	@Value("${server.port}")
	private String port; 
	
	
	
	
	@PostMapping
	public CabDriver add(@RequestBody CabDriver entity) {
		return this.service.save(entity);
	}
	
	@GetMapping
	public List<CabDriver> findAll()
	{
		return this.service.findAll();
	}
	
	@GetMapping(path = "/{id}")
	public CabDriver findById(@PathVariable("id") int id) {
		return this.service.findById(id).orElseThrow(() -> new RuntimeException("Element Not Found"));
	}
	
 
//	
//	 @DeleteMapping(path="/drivers/{id}")
//
//	  	
//	  	public ResponseEntity<Integer> remove(@PathVariable("id") int id) {
//
//	  	Integer driver = this.service.remove(id).orElseThrow(()->
//	  	new NoSuchElementException("Element not found"));
//
//	  	     return ResponseEntity.ok().body(driver);
	
	@GetMapping(path = "/srch/{name}")
	public CabDriver findByName(@PathVariable("name") String name) {
		
		CabDriver found = this.service.findByDriverName(name);
		
		found.setLocation(found.getLocation()+":" +port);
		
		return found;
	}
	
}
