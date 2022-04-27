package com.example.demo.services;
import java.sql.*;
import java.util.*;
import com.example.entity.Product;  


public class ProductService {

	private Connection con;

	public ProductService(Connection con) {
		super();
		this.con = con;
	}
	
	public int updatePriceByName(String productName,double newPrice) {
		int rowsUpdated=0;
		String sql = "update shanma_product set price=? where product_Name=?";
		try(PreparedStatement pstmt = con. prepareStatement(sql)){
			
			pstmt.setDouble(1, newPrice);
			pstmt.setString(2,productName );
			
			
			rowsUpdated=pstmt.executeUpdate();
		
	     }catch(SQLException e) {
		e.printStackTrace();
	}
		
		
		return rowsUpdated;
		
	}

	public int deleteById(int id) {
		
		int rowsDeleted = 0;
		
    String sql = "Delete from shanma_product where product_id=?";
	
		try(PreparedStatement pstmt = con.prepareStatement(sql)){
			
			pstmt.setInt(1,id);
			
			rowsDeleted= pstmt.executeUpdate();
			
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return rowsDeleted;
	}
	
	public Optional<Product> findById(int id) {
		
		Optional <Product> obj = Optional.empty();
		
 	String sql = "select * from Shanma_product where product_id=?";
	
		
		
try(PreparedStatement pstmt = con.prepareStatement(sql)){
	
	pstmt.setInt(1, id);
			
			ResultSet rs = pstmt.executeQuery();
			
			if(rs.next()) {
				int productId = rs.getInt("product_Id");
				String productName = rs.getString("product_Name");
				double price = rs.getDouble("price");
				
				Product prod = new Product(productId,productName,price);
				
				obj=Optional.of(prod);
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		
		return obj;
		
	}
	
	
	public int addProduct(Product product) {
		
		int rowAdded = 0;
		
		String sql = "insert into shanma_product values(?,?,?)";
		
		try(PreparedStatement pstmt = con.prepareStatement(sql)){
			
			pstmt.setInt(1,product.getProductId());
			pstmt.setString(2,product.getProductName());
			pstmt.setDouble(3,product.getPrice());
			
			rowAdded = pstmt.executeUpdate();
			
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return rowAdded;
		}
	
	
	public List<Product> findAll(){
		
		List<Product> productList = new ArrayList<Product>();
		
		String sql = "select * from shanma_Product";
		try(PreparedStatement pstmt = con.prepareStatement(sql)){
			
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				int productId = rs.getInt("product_Id");
				String productName = rs.getString("product_Name");
				double price = rs.getDouble("price");
				
				Product prod = new Product(productId,productName,price);
				
				productList.add(prod);
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		
		return productList;
	}

	
}
