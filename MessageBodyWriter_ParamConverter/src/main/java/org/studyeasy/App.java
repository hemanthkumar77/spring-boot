package org.studyeasy;

import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.studyeasy.model.details;


@Path("nice")
public class App {
    private int x=0;
  // MESSAGE BODY WRITER EXAMPLE
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public details demo() {
		return new details(100,"joker",6000.34,"senior-developer","male");
	}
    // param converter	 
	 @GET
	 @Path("/converter")
	 @Produces(MediaType.TEXT_PLAIN)
	 public details conversion(@QueryParam("obj")details val)
	 {
		 return val;
	 }
	 
}
