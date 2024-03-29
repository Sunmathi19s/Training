package com.example.demo.repo;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entity.Driver;

public interface DriverRepository extends JpaRepository<Driver, Integer> {
	

	
	//in the entity class there is no property firstname,so an exception will be thrown
	List<Driver>findByDriverName(String srchName);
	//List<Driver>findByDriverFirstName(String srchName);
	
	List<Driver>findBymobileNumber(double mobileNumber);
	
	
	@Query(value="from Driver where rating=:srchValue")
	List<Driver>searchByRating(@Param("srchValue")double rating);
	
	
	@Query(value="update Driver set rating =:updatedRating where driverId=:srchId")
	@Modifying
	@Transactional
	int modifyRating(@Param("srchId")int driverId,@Param("updatedRating")double updatedRating); //here int used bc of we are updating so we use int,ie update syntax is int



}
