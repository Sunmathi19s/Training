package com.training.ifaces;


import com.trainig.model.Book;
import java.util.*;


public interface CrudRepository {
	public boolean add(Book book);
	public Book findByBookId(int id);
	public boolean remove(Book book);
	public List<Book> findAll();
	

}
