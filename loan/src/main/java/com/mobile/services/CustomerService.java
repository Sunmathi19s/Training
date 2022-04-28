package com.mobile.services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.example.ifaces.CrudRepository;
import com.mobile.Customer;


public class CustomerService implements CrudRepository{
	private Connection con;
  public CustomerService(Connection con) {
		super();
		this.con=con;
		// TODO Auto-generated constructor stub
	}



	public int add(LoanApplication obj) {
		int addrow = 0;
		String custsql = "insert into shanma_customer values(?,?,?,?)";
		String loanAppsql = "insert into  shanma_loanapplication values(?,?,?)";
		
	try(PreparedStatement pstmt1 =con.prepareStatement(custsql);
	PreparedStatement pstmt2 =con.prepareStatement(loanAppsql)){
		{
		pstmt1.setInt(1,obj.getCustomer().getCustomerId());
		pstmt1.setString(2,obj.getCustomer().getCustomerName());
		pstmt1.setDouble(3, obj.getCustomer().getPhoneNumber());
		pstmt1.setDouble(4, obj.getCustomer().getCreditScore());
		pstmt1.executeUpdate();
	    pstmt2.setInt(1,obj.getApplicationNumber());
	    pstmt2.setInt(2,obj.getCustomer().getCustomerId());
	    pstmt2.setDouble(3,obj.getLoanAmount());
	   addrow= pstmt2.executeUpdate();
	}
	}catch(SQLException e) {
		e.printStackTrace();
	
	
	}
		
		return addrow;
	}

	
	

	public List findAll() {
		
	List<LoanApplication> loanList = new ArrayList<LoanApplication>();
	
	String sql = "select sc.customer_id,sc.customer_name,sc.phone_number,sc.credit_score,"
			+ "sl.application_number,sl.customer,sl.loan_amount from shanma_customer sc,"
			+ "shanma_loanapplication sl where sc.customer_id = sl.customer ";
		
	
	
	try(PreparedStatement pstmt =con.prepareStatement(sql)){
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				int customer_id = rs.getInt(1);
				String customer_name=rs.getString(2);
				double phone_number = rs.getDouble(3);
				int credit_score = rs.getInt(4);
				int application_number =rs.getInt(5);
				int customer = rs.getInt(6);
				double loan_amount = rs.getDouble(7);
				
				Customer customer1=new Customer(customer_id,customer_name,phone_number,credit_score);
					
				
			
			    LoanApplication loan =
			    		new LoanApplication(application_number,customer1,loan_amount);
			    loanList.add(loan);
			}
	}catch(SQLException e) {
		e.printStackTrace();
	}
	
	
		return loanList;
	}

	public int remove(int id) {
		int delrow = 0;
		return delrow;
	}

	public Optional<LoanApplication> findById(int id) {
		Optional<LoanApplication> optional =  Optional.empty();
		
		String sql = "select sc.customer_id,sc.customer_name,sc.phone_number,sc.credit_score,"
				+ "sl.application_number,sl.customer,sl.loan_amount from shanma_customer sc,"
				+ "shanma_loanapplication sl where sc.customer_id = ? ";
		
		
		try(PreparedStatement pstmt =con.prepareStatement(sql)){
			pstmt.setInt(1, id);
			ResultSet rs = pstmt.executeQuery();
			
			if(rs.next()) {
				int customer_id = rs.getInt(1);
				String customer_name=rs.getString(2);
				double phone_number = rs.getDouble(3);
				int credit_score = rs.getInt(4);
				int application_number =rs.getInt(5);
				double loan_amount = rs.getDouble(6);
				

				Customer customer1=new Customer(customer_id,customer_name,phone_number,credit_score);
				
			
			    LoanApplication loan =
			    		new LoanApplication(application_number,customer1,loan_amount);

			   optional =  Optional.of(loan);
			}
			  
		}catch(SQLException e) {
				e.printStackTrace();
			}
			
		
		return optional;
	}

	public int update(int id, Object obj) {
		// TODO Auto-generated method stub
		return 0;
	}



	@Override
	public int add(Object obj) {
		// TODO Auto-generated method stub
		return 0;
	}



	

}

