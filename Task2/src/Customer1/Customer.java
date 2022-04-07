package Customer1;

public class Customer {

	private String customerName;
	private int customerId;
	public String getcustomerName() {
		return customerName;
	}
	public void setcustomerName(String customerName) {
		customerName = customerName;
	}
	public int getcustomerId() {
		return customerId;
	}
	public void setcustomerId(int customerId) {
		customerId = customerId;
	}
	public long getphoneno() {
		return phoneno;
	}
	public void setphoneno(long phoneno) {
		this.phoneno = phoneno;
	}
	
	public Customer(String customerName, int customerId, long phoneno) {
		super();
		this.customerName = customerName;
		this.customerId = customerId;
		this.phoneno = phoneno;
	}

	private long phoneno;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
}
