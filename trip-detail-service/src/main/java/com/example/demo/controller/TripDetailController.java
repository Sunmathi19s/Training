package com.example.demo.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.TripDetail;
import com.example.demo.service.TripDetailService;




@RestController
@RequestMapping(path = "/api/v1/tripdetails")
public class TripDetailController {
	
	@Autowired
	public TripDetailService service;
	
	@PostMapping
	public TripDetail add(@RequestBody TripDetail entity) {
		return this.service.save(entity);
	}
	
	@GetMapping
	public List<TripDetail> findAll(){
		return this.service.findAll();
	}
	
	@GetMapping(path = "/{id}")
	public TripDetail findById(@PathVariable ("id") int id) {
		return this.service.findById(id).
				orElseThrow(() -> new RuntimeException("Element Not Found"));
	}
	
	@GetMapping(path = "/srch/{id}")
	public List<TripDetail> findByDriverId(@PathVariable ("id")int num) {
		return this.service.findByDriverId(num);
	}
	 

}
