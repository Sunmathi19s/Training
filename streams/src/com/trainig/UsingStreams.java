package com.trainig;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.*;
import com.trainig.model.*;
public class UsingStreams {

		public static void useDistinct (List<Book> bookList) {
		bookList.stream().distinct().forEach(System.out::println);
		}
		
		public static void collectToSet(List<Book> bookList) {
			Set<Book> bookSet = bookList.stream().filter(e -> e.getPrice()>500).collect(toSet());
			
			bookSet.forEach(System.out::println);
		}
		
		public static void collectToMap(List<Book> bookList) {
			// Set<Book> bookSet = bookList.stream().collect(toSet());
			Map<String,Double> values=bookList.stream().filter(e -> e.getPrice()>500)
					.distinct()
					.collect(toMap(Book::getBookName,Book::getPrice));
		
			values.forEach((key,value) ->System.out.println(key+","+value));
		}
		
		public static void findMaxPrice(List<Book> bookList) {
			Optional<Book> optional = bookList
					.stream()
					.max(Comparator.comparing(Book::getPrice));
			if(optional.isPresent()) {
				System.out.println("Maximum Price:=" +optional.get().getPrice());
			}
		}
	    public static void findMinPrice(List<Book> bookList) {
	    	Optional<Book> optional2 = bookList
	    			.stream()
	    			.min(Comparator.comparing(Book::getPrice));
	    	if(optional2.isPresent()) {
	    		System.out.println("minimum price :=" +optional2.get().getPrice());
	    	}
	    }
	    public static void countLetters(List<Book> bookList,String srchString) {
	    	long count = bookList.stream().filter(e -> e.getBookName().contains(srchString)).count();
	    	
	    		System.out.println(srchString + "Count :=" + count);
	    	
	    }
	    public static void countLetters1(List<Book> bookList,String srString) {
	    	long count1 = bookList.stream().filter(e -> e.getBookName().equalsIgnoreCase(srString)).count();
	    	System.out.println(srString +"Count :=" + count1);
	    }
	    
			

		
		public static void main(String[] args) {
			Book java = new Book(101,"Java","suba",450);
			Book spring = new Book(102,"Spring","Mad",650);
			Book maven = new Book(103,"maven","HArish",450);
			Book html= new Book(104,"Html","Priya",450);
			Book python = new Book(105,"Python","Sathya",450);
			Book mavenNew = new Book(103,"maven","HArish",450);
			Book htmlNew = new Book(104,"Html","Priya",450);
			
			List<Book> bookList = Arrays.asList(java,spring,maven,html,python,mavenNew,htmlNew);
			//useDistinct(bookList);
			//collectToSet(bookList);
			//collectToMap(bookList);
			//findMaxPrice(bookList);
			
			int key = 6;
			switch (key) {
			case 1:
				useDistinct(bookList);
				break;
			case 2:
				collectToSet(bookList);
				break;
			case 3:
				collectToMap(bookList);
				break;
			case 4:
				findMaxPrice(bookList);
				break;
			case 5:
				findMinPrice(bookList);
				break;
			case 6:
				countLetters(bookList,"v");
				break;
			case 7:
				countLetters1(bookList,"p");
				break;

			default:
				break;
			}

	}

}
