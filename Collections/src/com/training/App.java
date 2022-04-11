package com.training;

import java.util.*;

import com.trainig.model.Book;
import com.training.ifaces.CrudRepository;
import com.training.services.BookService;
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names = new ArrayList<>();
		
		names.add("Ramesh");
		names.add("Anand");
		names.add("chandru");
		names.add("Zahor");
		names.add("pavan");
		
		System.out.println(names);
		
       Collections.sort(names);
       System.out.println(names);
      
   		// TODO Auto-generated method stub
   		
   		Book spring = new Book(102,"Spring","Mad",650);
   		Book maven = new Book(103,"maven","HArish",450);
   		Book html= new Book(104,"Html","Priya",450);
   		Book python = new Book(105,"Python","Sathya",450);
   		
   	CrudRepository Service = new BookService();
   
   	Service.add(spring);
   Service.add(maven);
   	Service.add(html);
   	Service.add(python);
   	
   
   	
   	List<Book> bookList = Service.findAll(); 
   	
   	Collections.sort(bookList);
   	System.out.println(bookList);
	}

	
		// TODO Auto-generated method stub
		
	}


