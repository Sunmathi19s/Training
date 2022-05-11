package com.example.demo.repo;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	
	public List<Employee> findByDateOfBirth(LocalDate localdate);
	
	public List<Employee> findByLocation(String srchString);
	
	public List<Employee> findBySkillSet(String srchString);

}
