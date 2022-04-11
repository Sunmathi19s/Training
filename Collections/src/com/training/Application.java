package com.training;
import java.util.List;

import com.trainig.model.Book;
import com.training.ifaces.CrudRepository;
import com.training.services.BookService;



public class Application {
	

	public static void print(List<Book> books) {
		for(Book eachBook:books) {
		   System.out.println(eachBook);
	}
	}

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
	
	print(Service.findAll());
	
	List<Book> bookList = Service.findAll(); 
//	
//	for(Book eachBook:bookList) {
//		System.out.println(eachBook);
//	}
	print(bookList);
	Book foundBook = Service.findByBookId(101);
   System.out.println("Found book"+foundBook);
   
   Service.remove(python);
   System.out.println("=======");
   
   print(Service.findAll());
   
// List<Book> bookList2 = Service.findAll();  
   
   Book react = new Book(205,"ReactJs","Rahul",6850);
   
   Service.add(react);
   
   print(Service.findAll());
   
   Book reactNew = new Book(205,"ReacJs","Rahul kanwal",7850);
   Service.update(react,reactNew);
   
   System.out.println("=======AFTER UPDATE=====");
   print(Service.findAll());
   
   Book javaNew = new Book(101,"java","Malgudi suba",1450);
Service.update(react,javaNew);
   
   System.out.println("=======AFTER UPDATE=====");
   print(Service.findAll());
   
	}

}
