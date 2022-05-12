package com.example.demo.repo;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	
	public List<Employee> findByDateOfBirth(LocalDate localdate);
	
	public List<Employee> findByLocation(String srchString);
	
	public List<Employee> findBySkillSet(String srchString);
	
	public List<Employee> findBySkillSetOrLocation(String srchSkill,String srchLoc);
	
	
	@Query(nativeQuery = true,value = "select * FROM Tom_table WHERE skill_Set=:skillSet "
			+ "AND location=:location")
	public List<Employee> getBySkillLoc(@Param ("skillSet")String srchSkill,
			@Param ("location")String srchLoc);

}
