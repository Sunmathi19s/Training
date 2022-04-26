package com.example.demo;
import java.sql.*;
import java.util.Optional;

import com.example.demo.entity.Product;
import com.example.demo.services.ProductService;

public class Application {
	public static void main(String[] args) {
		Connection con;
		try {
			con = DriverManager.getConnection("jdbc:oracle:thin:@10.90.1.105:1521/DEV","HR","HR");
			
			ProductService service = new ProductService(con);
			//row added
			Product toAdd = new Product(94,"ups",17470.00);
			
//			int rowAdded = service.addProduct(toAdd);
//			
//			System.out.println("ROW ADDED :=" +rowAdded);
			
			
			//row deleted
			
			
			int rowDelete = service.deleteById(94);
			
			System.out.println("row deleted :=" +rowDelete);
			
			//findby id
			
			  Optional <Product> found = service.findById(10);
			  
			  if(found.isPresent()) {
			System.out.println("find id :="+found.get());
			  }else {
				  System.out.println("item not found");
			  }
			  
			  //update
			  
			  int rowUpdate = service.updatePriceByName("tv", 9800);
			  System.out.println("rows Updated :=" +rowUpdate);
			
			  
			  
		     service.findAll().forEach(System.out::println);
		     
		    
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
