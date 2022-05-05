package com.mobile.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.mobile.Student;

public class StudentService {
	private  List<Student> studentList=new ArrayList<Student>();

	public StudentService() {
		super();
		this.studentList=new ArrayList<Student>();
		
	}
	
	public List<Student> getAll(){
		return this.studentList;
	}
		
		public Optional<Student>  findById(int id) {
			return this.studentList.stream().filter(e -> e.getRollNumber()==id).findFirst();
		}
		
		public boolean  remove(int id) {
			return this.studentList.removeIf(e -> e.getRollNumber()==id);
					
		}
		
		
		public Student update(int id,Student newValue) {
			
			int idxPos = this.studentList.indexOf(findById(id).get());
			
			 this.studentList.set(idxPos, newValue);
			 return newValue;
		}

		public boolean add(Student student) {
			// TODO Auto-generated method stub
			return this.studentList.add(student);
		}
	}
	



