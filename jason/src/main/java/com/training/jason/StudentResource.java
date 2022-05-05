package com.training.jason;

import java.util.List;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("students")
public class StudentResource {
	
	private static StudentService service=new StudentService();
	
	public StudentResource() {
		super();
		
	}
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Student> getAllStudent() {
		
	
		return service.getAll();
		
	}
	
	@GET
	@Path("/{rollNumber}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response findById(@PathParam("rollNumber")int id) {
		
		try {
			Student entity=service.findById(id).orElseThrow(()->new RuntimeException("Id not found"));
		return Response.ok(entity).build();
			}catch(RuntimeException e) {
				e.printStackTrace();
				return Response.ok("id not found").status(400).build();
			}
		
		
	}
	

	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public Response add(Student student) {
		
		boolean result=service.add(student);
		if(result) {
			return Response.ok(student).status(201).build();
		}else {
			return Response.status(400,"Not Created").build();
		}
		
	}
	
	@DELETE
	@Path("/{rollNumber}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response remove(@PathParam("rollNumber")int id) {
		boolean result=service.remove(id);
		if(result) {
			return Response.status(204,"One resource deleted").build();
		}else {
			return Response.status(400,"Not Deleted").build();
		}
	}
	
//	@POST
//	@Produces(MediaType.APPLICATION_JSON)
//	public Student getStudent() {
//		
//		Student ram= new Student(101,"Ramesh",98.0);
//		
//		return ram;
//		a
//	}
	
	
	@PUT
	@Path("/{rollNumber}")
	@Produces(MediaType.APPLICATION_JSON)
	public Student updateById(@PathParam("rollNumber")  int id , Student newStudent)
	{
		return service.update(id,newStudent);
	}

	
	
	

	
}
