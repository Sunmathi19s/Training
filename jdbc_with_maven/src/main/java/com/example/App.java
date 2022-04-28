package com.example;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.time.LocalDate;

import com.example.dao.MemberRepository;
import com.example.demo.services.Invoice;
import com.example.demo.services.ProductService;

import com.example.entity.Member;
import com.example.entity.Product;
import com.example.util.ConnectionFactory;

/**
 * Hello world!
 *
 */
public class App 
{
	
	public static void member() {
		  Connection con;
			try {
				 con = ConnectionFactory.getOracleConnection();
				MemberRepository service = new MemberRepository(con);
				
				
			
				
				System.out.println(con);
				
				service.findAll().forEach(System.out::println);
					
				}catch (Exception e){
					e.printStackTrace();
			}
		    

		    	 
		    	    try {
		    	      	con=ConnectionFactory.getPostgressConnection();
		    	      	System.out.println(con);
		    	    }catch(Exception e) {
		    	    	e.printStackTrace();
		    	    }
		
	}
	
	public static void product() {
		
		Connection con;
	    con = ConnectionFactory.getPostgressConnection() ;
		
		ProductService service = new ProductService(con);	
		//row added
		Product toAdd = new Product(94,"ups",17470.00);	
		
	    int rowAdded = service.addProduct(toAdd);
	
		System.out.println("ROW ADDED :=" +rowAdded);
		
		service.findAll().forEach(System.out::println);
	}
   // public static void main( String[] args )
   //{
   //    product();
        

    	    
    //	    }
    
    public static void main( String[] args ) {
		
		Connection con;
    Connection con1 = ConnectionFactory.getOracleConnection();
	
	ProductService service = new ProductService(con1);
	Product laddu=new Product(96,"laddu",89);
	Invoice mani=new Invoice(82, " mani", 6,4);
	
	service.usingTxn (laddu,mani);
    }
}

