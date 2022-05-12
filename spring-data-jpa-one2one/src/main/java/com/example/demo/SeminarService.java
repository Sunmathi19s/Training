package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Seminar;
import com.example.demo.entity.Speaker;

@Service
public class SeminarService {
	
	@Autowired
	Seminar sem;
	
	
	@Autowired
	Speaker spk;
	
	
	@Autowired
	SeminarRepositary repo;
	
	public void create() {
		Seminar added = repo.save(sem);
		
		if(added != null) {
			System.out.println("added successfully");
		}
		
		
	}
	//List<Seminar> show = repo.findAll();
	

}
