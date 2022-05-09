package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Primary;
import org.training.model.Author;
import org.training.model.Book;

import com.example.demo.model.Bill;
import com.example.demo.model.CustomerList;
import com.example.demo.model.Invoice;
import com.example.demo.model.Student;
import com.example.demo.model.Teacher;

@SpringBootApplication
@ComponentScan(basePackages = {"org.training","com.example"})

public class SpringQuickStart1Application {

//	public static void main(String[] args) {
//		//ApplicationContext = IOC container
//		ApplicationContext ctx =SpringApplication.run(SpringQuickStart1Application.class, args);
//		
//		//----when using Id need to cast to specific bean since
//		//----return type of getBean method is object
//		System.out.println(ctx.getBean("ram"));
//		
//		//System.out.println(ctx.getBean("Teacher"));
//		 
//		//-----casting not required,but there should be only one bean of that type
//	    //will throw Exception
//		Student shyam = ctx.getBean(Student.class);
//		
//		
//		//----when more than one bean of the same type available
//		//----should use id and class name
//		Teacher stella = ctx.getBean("stella",Teacher.class);
//		
//		 stella.setId(494);
//	     stella.setName("stella sundari");
//		 stella.setSubject("fluid mech");
//		
//		System.out.println(stella);
//		
//		
//		//-----casting not required,but there should be only one bean of that type
//		//will throw Exception
//		Teacher harish = (Teacher) ctx.getBean("harish");
//		System.out.println(harish);
//	}
	
	public static void main(String[] args) {
		
		ApplicationContext ctx =SpringApplication.run(SpringQuickStart1Application.class, args);
		//added new book and author class
		System.out.println(ctx.getBean(Book.class));
		
		
		//if we put a kumar as a method name then we will get a output of harish otherwise get a output of default one
		//System.out.println("author :=" +ctx.getBean("kumar"Author.class));
		
		System.out.println("author :=" +ctx.getBean(Author.class));
		
		Invoice inv = ctx.getBean(Invoice.class);
		System.out.println(inv);
		
		Bill bill = ctx.getBean(Bill.class);
		
		System.out.println("Customer :=" +bill.getCustomer());
		System.out.println("Product :=" +bill.getProduct());
		
		CustomerList list=ctx.getBean(CustomerList.class);
		
		list.getCustList().forEach(System.out::println);
		

}
	
	@Bean
	public Author kumar() {
		return new Author(101,"Harish Kumar");
	}
	
	@Bean
	@Primary
	public Author mani() {
		return new Author(102,"mani");
	}
}
