package com.trainig;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.training.model.Student;

public class HashMap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student ram = new Student(101,"anand",78);
		Student shyam = new Student(102,"basky",68);
		Student mukesh = new Student(103,"mukesh",78);
		
		HashMap<Integer,Student> map = new HashMap<>();
		
		map.put(900, ram);
		map.put(902, shyam);
		map.put(903, mukesh);
		
		System.out.println(map.get(900));
		System.out.println(map.get(902));
		System.out.println(map.get(903));
		
		System.out.println("only key value");
		 Set <Integer>keys = map.keySet();
		
		for(Integer key:keys) {
		 System.out.println(map.get(key));
	}
		System.out.println("onlu map values");
		Collection<Student> list =map.values();
		
		for(Student eachStudent : list) {
			System.out.println(eachStudent);
		}
		System.out.println("Both key and value");
		Set<Map.Entry<Integer,Student>> list2 = map.entrySet();//Map.Entry interface
		for(Map.Entry<Integer, Student> eachEntry:list2){
			System.out.println(eachEntry.getKey());
			System.out.println(eachEntry.getValue());
		}

}
}