package com.training.services;

import java.util.List;
import java.util.function.Predicate;
import java.util.ArrayList;
import java.util.Comparator;

import com.trainig.model.Book;
import com.training.ifaces.CrudRepository;

import static java.util.stream.Collectors.*;

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


	
	public List<Book> findBookGrtThan(double price){
		return this.bookList.stream().filter(e -> e.getPrice()>price).collect(toList());
	}
	
	public List<Book> sortedByName(){
		return this.bookList.stream().sorted(Comparator.comparing(Book :: getBookName)).collect(toList());

	}
	
	public List<Book> sortedByNumberDesc(){
		return this.bookList.stream().sorted(Comparator.reverseOrder()).collect(toList());
	}
	
	public List<String> getBookNames(){
		return this.bookList.stream().map(e -> e.getBookName()).collect(toList());
	}
	
	public List<String> getBookNameGrtThanPrice(double price){
		return this.bookList.stream().filter(e->e.getPrice()>price).map(e -> e.getBookName()).collect(toList());
	}
	
	
	public List<Book> getBookGrtThan(double price){
	List<Book> grtThanList = new ArrayList<>();
	Predicate<Double> grtThan = (value) -> value>price;
	
	this.bookList.forEach(book ->
	{
		double bookPrice = book.getPrice();
		if(grtThan.test(bookPrice)) {
			grtThanList.add(book);
		}
	});
 return grtThanList;
	
	
	
	}

}
