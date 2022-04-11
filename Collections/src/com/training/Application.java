package com.training;
import java.util.List;

import com.trainig.model.Book;
import com.training.ifaces.CrudRepository;
import com.training.services.BookService;



public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book java = new Book(101,"Java","suba",450);
		Book spring = new Book(102,"Spring","Mad",650);
		Book maven = new Book(103,"maven","HArish",450);
		Book html= new Book(104,"Html","Priya",450);
		Book python = new Book(105,"Python","Sathya",450);
		
	CrudRepository Service = new BookService();
	System.out.println("Is Added :=" +Service.add(java));
	System.out.println(Service.add(spring));
	System.out.println(Service.add(maven));
	System.out.println(Service.add(html));
	System.out.println(Service.add(python));
	
	List<Book> bookList = Service.findAll(); 
	
	for(Book eachBook:bookList) {
		System.out.println(eachBook);
	}
	Book foundBook = Service.findByBookId(101);
   System.out.println(foundBook);
	}

}
