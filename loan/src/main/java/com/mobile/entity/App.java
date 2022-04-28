package com.mobile.entity;
import java.sql.*;
import java.util.Optional;

import com.mobile.Customer;
import com.mobile.services.CustomerService;
import com.mobile.services.LoanApplication;
import com.mobile.util.ConnectionFactory;
/**
 * Hello world!
 *
 */
public class App 
{
  
	public static void main( String[] args )
    {
		Connection con;
		con = ConnectionFactory.getOracleConnection();
      System.out.println(con);
      
      CustomerService service = new CustomerService(con);
      
    
      System.out.println("///////////////////////////////////////////////////////////////////////////////");
      service.findAll().forEach(System.out::println);
      
     
      
    Optional<LoanApplication> find = service.findById(1);
    System.out.println("////////////////////////////////////////////////////////////////");
    System.out.println(find);
    
    Customer toAdd = new Customer(67,"todo",853478812,456);
    LoanApplication toAdd1 = new LoanApplication( 89, toAdd,3500);
    
  System.out.println("//////////////////////////////////////////////////////////////////////");
  
    
    System.out.println(service.add(toAdd1));
    
    }
}
