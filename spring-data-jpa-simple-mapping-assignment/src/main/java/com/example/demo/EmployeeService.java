package com.example.demo;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.repo.EmployeeRepository;

@Service
public class EmployeeService {
	private EmployeeRepository repo;

	@Autowired
	public EmployeeService(EmployeeRepository repo) {
		super();
		this.repo = repo;
	}
	
	public Employee add(Employee entity) {
		return this.repo.save(entity);
	}
	
	public List<Employee> findByDateOfBirth(LocalDate localdate){
		return this.repo.findByDateOfBirth(localdate);
	}
	
	public List<Employee> findByLocation(String srchString){
		return this.repo.findByLocation(srchString);
	}
	
	public List<Employee> findBySkill(String srchString){
		return this.repo.findBySkillSet(srchString);
	}
	
}
