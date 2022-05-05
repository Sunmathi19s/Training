package com.mobile;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("ourresource")
public class MyResource {
	
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getMessage() {
		return "Hello Tom";
	}

}
