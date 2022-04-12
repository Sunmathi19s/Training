package com.training.services;

import java.util.List;
import java.util.ArrayList;

import com.trainig.model.Book;
import com.training.ifaces.CrudRepository;


public  class BookService implements CrudRepository {
	private ArrayList<Book> bookList; //syntax

	@Override
	public boolean add(Book book) {
		// TODO Auto-generated method stub
		return bookList.add(book);
	}
	
	public BookService() {
		super();
		this.bookList=new ArrayList<>();//value pass  @ syntax
	}

	@Override
	public Book findByBookId(int id) {
		Book found =  null;
		// TODO Auto-generated method stub
		for(Book eachBook:this.bookList) {
			if(eachBook.getBookNumber ()==id) {
				found = eachBook;
			}
		}
		return found;
	}

	@Override
	public boolean remove(Book book) {
		
		// TODO Auto-generated method stub
		return bookList.remove(book);
		}
		
	
	
	public List<Book> findAll(){
		return this.bookList;
	}

	@Override
	public Book update (Book oldBook,Book newBook) {
		
		// TODO Auto-generated method stub
		if(this.bookList.contains(oldBook)) {
			//System.out.println("Inside IF BLOCK ######");
			int idxPos = this.bookList.indexOf(oldBook);
			this.bookList.set(idxPos, newBook);
	
		
		}
		return newBook;
	}

	

}
