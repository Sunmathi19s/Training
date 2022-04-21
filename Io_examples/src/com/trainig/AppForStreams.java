package com.trainig;

import java.io.File;

import com.trainig.model.Book;
import com.trainig.services.BookService ;

public class AppForStreams {

	public static void main(String[] args) {
		BookService service = new BookService();
		
		File file = new File("book.ser");
		
		int ch = 2;
		if(ch==1) {
			
		
		Book book = new Book(8847,"Oracle","Harish",560);
		
		
		boolean result  = service.writeToStream(file, book);
		
		if(result) {
			System.out.println("one Record Serialized");
		}
		
		}else {
			Book fromFile =  (Book) service.readFromStream(file);
			
			System.out.println(fromFile.getBookName());
			System.out.println(fromFile);
		}
				

	}

}
