package com.example.demo.services;

public class  Invoice {
	
	private int invoiceNumber;
	private String CustomerName;
	private double quantity;
	private int productRef;
	public Invoice() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Invoice(int invoiceNumber, String customerName, double quantity, int productRef) {
		super();
		this.invoiceNumber = invoiceNumber;
		CustomerName = customerName;
		this.quantity = quantity;
		this.productRef = productRef;
	}
	public int getInvoiceNumber() {
		return invoiceNumber;
	}
	public void setInvoiceNumber(int invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}
	public String getCustomerName() {
		return CustomerName;
	}
	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}
	public double getQuantity() {
		return quantity;
	}
	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}
	public int getProductRef() {
		return productRef;
	}
	public void setProductRef(int productRef) {
		this.productRef = productRef;
	}
	@Override
	public String toString() {
		return "Invoice [invoiceNumber=" + invoiceNumber + ", CustomerName=" + CustomerName + ", quantity=" + quantity
				+ ", productRef=" + productRef + "]";
	}

}
