package com.mobile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Fruit {
	

	
	public static void main (String[] args) {
		
		try {
			
			File myFile= new File("File.txt");
			if(myFile.createNewFile()) {
				System.out.println("File created:"+myFile.getName());
			}else {
				System.out.println("File Already Exists");
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
		try {
			FileWriter myWriter = new FileWriter("File.txt");
			myWriter.write("Apple is red in colour, Orange is round in shape,"
					+ " Banana is good for health, Grapes will grow as bunch,"
					+ " Mango is a seasonal fruit");
			myWriter.close();
			System.out.println("Successfully Write the file");
			
		}catch(IOException e) {
			System.out.println("An error Occured");
			e.printStackTrace();
		}
		


		
   	try {
		File myFile= new File("File.txt");
		Scanner myReader= new Scanner(myFile);
				while(myReader.hasNextLine()) {
				String data= myReader.nextLine();
				System.out.println(data);
			}
			myReader.close();	
		}catch(FileNotFoundException e) {
			System.out.println("An Error Occured");
			e.printStackTrace();
		}
		
		File myFile=new File("Fruit.txt");
		if(myFile.delete()) {
		System.out.println("Deleted the file:"+myFile.getName());
		
	}else {
			System.out.println("Failed to delete ");
		}

		
	}

}
