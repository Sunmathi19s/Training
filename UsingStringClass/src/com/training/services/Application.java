package com.training.services;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringService service = new StringService();
		String city = "CHENNAI";
		System.out.println(String.format("%s", city));
		System.out.println(String.format("%3.4f %2$.3f %1$.2f ", 100.456,200.4567,300.56789));
	
		int key = 14;
		switch(key) {
		case 1:
			service.stringEquals("ram", "ram");
			break;
		case 2:
			service.stringObjectEquals();
			break;
		case 3:
			service.usingTrim("  ramesh  " );
			break;
			
		case 4:
			
			service.lengthOfString("  ramesh  ");
			
			break;
		case 5:
			service.usingSubString("kuttylife");
			break;
		case 6:
			service.usingCharAtAndIndexof("ram@abc.com");
			break;
		case 7:
			service.usingReplace("ram@abc.com", "Welcome to chennai");
			break;
		case 8:
			service.usingConcat("Hello "," chennai");
			break;
		case 9:
			service.usingCompareTo("C", "B");
			break;
		case 10:
			service.usingStringFormat("ram",45.298);
			break;
		case 11:
			service.usingStringFormat(16);
			break;
		case 12:
			service.usingStringFormat(16,16);
			break;
		case 13:
			service.usingStringFormat("ram","ram");
			break;
		case 14:
			service.usingStringFormat(423L);
			break;
			
			default:
				break;


	}


	}
}
