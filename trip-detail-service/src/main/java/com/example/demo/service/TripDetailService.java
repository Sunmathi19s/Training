package com.example.demo.service;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.TripDetail;
import com.example.demo.repo.TripDetailRepository;


@Service
public class TripDetailService {
	
	@Autowired
	public TripDetailRepository repo;

	public TripDetailService(TripDetailRepository repo) {
		super();
		this.repo = repo;
	}
	
	
	public TripDetail save(TripDetail entity) {
		return repo.save(entity);
	}
	
	
	public List<TripDetail> findAll(){
		return repo.findAll();
	}
	
	public Optional<TripDetail> findById(int id){
		return repo.findById(id);
	}
	
	public void remove(int id) {
		Optional<TripDetail> foundElement=repo.findById(id);
		
		if(foundElement.isPresent())
		{
			repo.deleteById(id);
		}else {
			throw new RuntimeException("Element with"+id+"Not Present");
		}
	}
	
	
	public List<TripDetail> findByDriverId(int num) {
		return repo.findByDriverId(num);
	}
	

}
