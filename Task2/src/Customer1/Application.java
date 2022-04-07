package Customer1;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Customer obj = new Customer("ram",45,1234567890);
		System.out.println("Customer Name="+obj.getcustomerName());
		System.out.println("Customer Id="+obj.getcustomerId());
		System.out.println("Customer phone no="+obj.getphoneno());

	}
}
