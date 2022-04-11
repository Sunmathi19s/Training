package com.training.services;

import java.util.List;
import java.util.ArrayList;

import com.trainig.model.Book;
import com.training.ifaces.CrudRepository;


public  class BookService implements CrudRepository {
	private ArrayList<Book> bookList;

	@Override
	public boolean add(Book book) {
		// TODO Auto-generated method stub
		return bookList.add(book);
	}
	
	public BookService() {
		super();
		this.bookList=new ArrayList<>();
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
		return false;
	}
	
	public List<Book> findAll(){
		return this.bookList;
	}

}
