package com.example.demo;

import java.util.*;

public class Application {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Name");
		
		String name = sc.next();
		
		System.out.println("Enter the Farenheit Temp");
		double farenTemp = sc.nextDouble();
		
		 Converter  convobj = new  Converter();
				  
				System.out.println(convobj.convert(name));
				System.out.println("CElSIUS Temp:="+convobj.convert(farenTemp));
				
		        System.out.println("Enter the amount");
		        double amount = sc.nextDouble();
		        
		        System.out.println("Enter the current to cinvert 1-USD 2-EURO");
		        int frm = sc.nextInt();
		        
		        System.out.println(convobj.convert(amount,frm));
		sc.close();
		
		
		// TODO Auto-generated method stub

	}

}
