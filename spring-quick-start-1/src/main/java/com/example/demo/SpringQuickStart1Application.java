package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.model.Bill;
import com.example.demo.model.CustomerList;
import com.example.demo.model.Invoice;
import com.example.demo.model.Student;
import com.example.demo.model.Teacher;

@SpringBootApplication

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
		
		Invoice inv = ctx.getBean(Invoice.class);
		System.out.println(inv);
		
		Bill bill = ctx.getBean(Bill.class);
		
		System.out.println("Customer :=" +bill.getCustomer());
		System.out.println("Product :=" +bill.getProduct());
		
		CustomerList list=ctx.getBean(CustomerList.class);
		
		list.getCustList().forEach(System.out::println);
		

}
}
