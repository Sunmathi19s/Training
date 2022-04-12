package com.mobile;

public class Product {
	private int productid;
	private String productName;
	private double ratePerUnit;
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getRatePerUnit() {
		return ratePerUnit;
	}
	public void setRatePerUnit(double ratePerUnit) {
		this.ratePerUnit = ratePerUnit;
	}
	public Product(int productid, String productName, double ratePerUnit) {
		super();
		this.productid = productid;
		this.productName = productName;
		this.ratePerUnit = ratePerUnit;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

}
