package com.mobile.resources;

import java.util.List;

import com.mobile.Student;
import com.mobile.services.StudentService;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/students")
public class StudentResource {
	
	private static StudentService service = new StudentService();

	
	public StudentResource() {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Student> getAllStudent() {

		return service.getAll();
	}
	@GET
	@Path("/{rollNumber}")
	@Produces(MediaType.APPLICATION_JSON)
	public Student findById(@PathParam("rollNumber")int id) {
	 
	return service.findById(id).orElseThrow(() -> new RuntimeException("Id Not Found"));
	}
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Student add(Student student) {
		
	 
	boolean result = service.add(student);
	
	if(result) {
		return student;
	}else {
		return null;
	}
	}
	
	@DELETE
	@Path("/{rollNumber}")
	@Produces(MediaType.APPLICATION_JSON)
	public boolean  remove(@PathParam("rollNumber")int id) {
		return service.remove(id);
	}
	@PUT
	@Path("/{rollNumber}")
	@Produces(MediaType.APPLICATION_JSON)
	public Student updateById(@PathParam("rollNumber")  int id , Student newStudent)
	{
		return service.update(id,newStudent);
	}
	
	
}
