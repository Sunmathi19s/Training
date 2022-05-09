package com.example.demo.ifaces;

import java.util.List;

import com.example.demo.entity.Product;

public interface CrudRepository<T> {
	
	public int add(T t);
	public List<T> findAll();
	public  T findById (int id);
	public int Update(T t);
	public int remove(int id);
	

}
