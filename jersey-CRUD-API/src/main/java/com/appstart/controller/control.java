package com.appstart.controller;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.appstart.model.employee;
import com.appstart.service.service;

@Path("/employer")
public class control {
service obj=new service();
@Path("/api_fetch")
public delegate get()
{
	return new delegate();
}

@Path("/HR/single_record/insert")
@POST
@Consumes(MediaType.APPLICATION_XML)
public Response save(employee emp)
{
 boolean val=obj.create(emp);
 if(val==false)
 {
	 return Response.status(Status.CONFLICT).entity("value exist in DB").build();
 }
 else
 {
	 return Response.status(Status.CREATED).entity("value created in DB").build();
 }
 
}

@Path("/update")
@PUT
@Consumes(MediaType.APPLICATION_XML)
public Response update(employee emp)
{
  int id=emp.getId();
boolean val = obj.update_record(emp,id);
if(val==false)
{
	return Response.status(Status.NOT_FOUND).entity("value is not in DB").build();
}
else
{
	return Response.status(Status.OK).entity("value is updated in DB succesfully").build();
}

}

@Path("/delete/{id}")
@DELETE
public Response delete(@PathParam ("id") int id)
{
 boolean val=obj.delete(id);
 if(val==false)
 {
	 return Response.status(Status.NOT_FOUND).entity("value not in DB").build();
 }
 else
 {
	 return Response.status(Status.OK).entity("deleted from the DB").build();
 }
}
}
