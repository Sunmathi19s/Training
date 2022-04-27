package com.mobile.entity;
import java.sql.*;

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
    
    }
}
