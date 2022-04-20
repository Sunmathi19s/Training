package com.trainig.services;

import java.io.File;

import com.trainig.model.Book;

public class Application {

	public static void main(String[] args) {
		
//		Book java = new Book(109,"html","krish",780 );
//		
		BookService service = new BookService();
//		boolean result = service.writeToFile(new File("Books.txt"), java);
//		if(result) {
//			System.out.println("one record added to file");
//		}
		service.readFromFile(new File("Books.txt")).forEach(System.out::println);

	}

}
