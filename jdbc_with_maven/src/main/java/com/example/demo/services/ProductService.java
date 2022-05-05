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
	public void usingTxn(Product prd1,Product prd2) {
		String sql = "insert into shanma_Product values(?,?,?)";
		try(PreparedStatement pstmt = con.prepareStatement(sql)){
			
			con.setAutoCommit(false);
			
			pstmt.setInt(1,prd1.getProductId());
			pstmt.setString(2,prd1.getProductName());
			pstmt.setDouble(3, prd1.getPrice());
			 
			int rowAdded = pstmt.executeUpdate();
			
			pstmt.setInt(1, prd2.getProductId());
			pstmt.setString(2, prd2.getProductName());
			pstmt.setDouble(3, prd2.getPrice());
			
			int rowAdded2 = pstmt.executeUpdate();
			
			if(prd2.getPrice()>prd1.getPrice()) {
				con.commit();
			}else {
				con.rollback();
			}
			
			con.commit();
			System.out.println("ROW ADDED :=" +rowAdded+","+rowAdded2);
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	public int  usingTxn(Product prd1,Invoice invoice) {
		int rowAdded =0;
		//g int productAddCount = 0;
		
		String  addProductsql = "insert into shanma_Product values(?,?,?)";
		String addInvoicesql = "insert into shanma_invoice values(?,?,?,?)";
		try(PreparedStatement prodstmt = con.prepareStatement(addProductsql);
				PreparedStatement invpstmt = con.prepareStatement(addInvoicesql)){
			
			con.setAutoCommit(false);
			
			prodstmt.setInt(1,prd1.getProductId());
			prodstmt.setString(2,prd1.getProductName());
			prodstmt.setDouble(3, prd1.getPrice());
			
			int  productAddCount = prodstmt.executeUpdate();
			
			invpstmt.setInt(1, invoice.getInvoiceNumber());
			invpstmt.setString(2, invoice.getCustomerName());
			invpstmt.setDouble(3, invoice.getQuantity());
			invpstmt.setInt(4, invoice.getProductRef());
			
	     invpstmt.executeUpdate();
			
			con.commit();
			rowAdded = productAddCount;
			// g System.out.println("===================");
			System.out.println(rowAdded);
			
		}catch(SQLException e) {
			e.printStackTrace();
			try {
				con.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		return  rowAdded;
	}
	
	

}


