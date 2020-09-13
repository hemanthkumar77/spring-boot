package org.studyeasy;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.SyncInvoker;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Link.Builder;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


@Path("app")
public class App {
	
	static Client client = ClientBuilder.newClient();
    static WebTarget response = client.target("http://localhost:8080/jersey-CRUD-API/employer/"); 
    static  WebTarget obj=response.path("{id}");
	
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/create")
    public void create()
    {
    	Response rest=response.request(MediaType.APPLICATION_JSON).post(Entity.json(new employee(301,"mill",3,"python",5000.67)));
    	System.out.print(rest.toString());
    }
    
 	
	@GET
	@Path("/get_id/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public String target(@PathParam ("id") int id) {    

         Client client = ClientBuilder.newClient();
         WebTarget response =  client.target("http://localhost:8080/jersey-CRUD-API/employer/api_fetch/employee/id"); 
         WebTarget obj=response.path("{id}");
         
          String object=obj.resolveTemplate("id",id).request(MediaType.APPLICATION_JSON).get(String.class);
         return object;
	}
	
	@DELETE
	@Path("/del_id/{id}")
	public String del(@PathParam ("id") int id)
	{
		 Response response=obj.resolveTemplate("id",id).request().delete();
		 return response.toString();
	}
	
	@PUT
	@Path("/update")
	 @Consumes(MediaType.APPLICATION_JSON)
	public String update()
	{
		Response res=response.request(MediaType.APPLICATION_JSON).put(Entity.json(new employee(301,"mill",3,"python",6000.67)));
		return res.toString();
	}
}
