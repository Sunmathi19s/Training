package Employee;

import java.util.*;

public class Application {

	public static void main(String[] args) {
		Employee1 obj = new Employee1();
		
		Scanner in = new Scanner(System.in);
		System.out.println("enter employee id");
		int empid = in.nextInt(); 
		
		
		System.out.println("Enter employee name");
		String name = in.next();
		;
		
		System.out.println("Enter employee salary");
		double salary = in.nextDouble();
		
		obj.setEmpid(empid);
		obj.setName(name);
		obj.setSalary(salary);
		
		System.out.println(obj.getEmpid());
		System.out.println(obj.getName());
        System.out.println(obj.getSalary());
		
        in.close();
		// TODO Auto-generated method stub

	}

}
