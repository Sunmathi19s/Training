package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.HealthInsurance;
import com.example.demo.entity.LifeInsurance;
import com.example.demo.ifaces.InsuranceRepository;

@Service
public class InsuranceService {
	
	@Autowired
	InsuranceRepository repo;

	@Autowired
	HealthInsurance entity;
	
	@Autowired
	LifeInsurance liferepo;
	
	public void addHealthPolicy() {
		Object obj = repo.save(entity);
		
		if(obj!=null) {
			System.out.println("one Record Added ");
		}
	}
	
	public void getHealthPolicy() {
		repo.findHealthPolicy().forEach(System.out::println);
	}
	
	public void addLifepolicy() {
		Object obj=repo.save(liferepo);
		if(obj!=null) {
			System.out.println("one record added");
		}
	}
	public void getlifePolicy() {
		repo.findLifePolicy().forEach(System.out::println);
	}
	
	public void getAllPolicy() {
		repo.findAll().forEach(System.out::println);
	}
}
