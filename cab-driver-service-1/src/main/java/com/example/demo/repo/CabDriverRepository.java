package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.CabDriver;

public interface CabDriverRepository extends JpaRepository<CabDriver, Integer> {
	
	CabDriver findByDriverName(String qryName);
	
	//List<CabDriver> findByDriverId()

}