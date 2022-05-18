package com.example.demo.service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Driver;
import com.example.demo.repo.DriverRepository;
import org.springframework.data.domain.Sort;

@Service
public class DriverService {
	
	@Autowired
	private DriverRepository repo;
	
	public DriverService(DriverRepository repo) {
		super();
		this.repo = repo;
	}

	public List<Driver> findAll() {
		
		return this.repo.findAll();
	}

	

	public Driver add(Driver entity) {
		
		return this.repo.save(entity);
	}
	
	public Driver findById(int id) {
		
		
		return this.repo.findById(id).orElseThrow( () ->new RuntimeException(id + "Not Found"));
	}
	
	//-------------------remove in body method------------
//	public Driver remove(Driver entity) {
//		boolean result = this.repo.existsById(entity.getDriverId());
//		
//		if(result) {
//			this.repo.delete(entity);
//		}else {
//			throw new NoSuchElementException("Element with id ="+entity.getDriverId()+"Not Present" );
//		}
//		return entity;
//	}
	


	
	public Optional<Integer> remove(int id) {
		   
		   Optional<Integer> optional = Optional.empty();

		if(this.repo.existsById(id)) {

		this.repo.deleteById(id);


		optional = Optional.of(id);

		}

		      return optional;  
		 }
	
	public List<Driver> findByDriverName(String srchName){
		return this.repo.findByDriverName(srchName);
	}
	
	public List<Driver> srchByMobileNumber(double number){
		return this.repo.findBymobileNumber(number);
	}
	
	public List<Driver> srchByDriverRating(double  rating){
		return this.repo.searchByRating(rating);
	}
	
	public int updateRating(int id,double  updatedrating){
		return this.repo.modifyRating(id,updatedrating);
	}

	
	
	public List<Driver> sortedList(String propName){
		return this.repo.findAll(Sort.by(propName));
	}
	
	
	
	
	
	
	
	
	
	
	
}
