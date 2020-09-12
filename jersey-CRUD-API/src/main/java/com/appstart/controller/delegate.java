package com.appstart.controller;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;

import com.appstart.model.Links;
import com.appstart.model.employee;
import com.appstart.service.service;

public class delegate {
	service obj=new service();
	@Path("/employee/dept")
	@GET	
	@Produces(MediaType.APPLICATION_XML)
	public List<employee> details(@QueryParam("dept_id")int dept_id)
	{
		return obj.get_by_dept(dept_id); 
	}
	
	@Path("/employee/{sal}")
	@Produces(MediaType.APPLICATION_XML)
	@GET
	public List<employee>list(@PathParam("sal")double sal)
	{
		return obj.get_sal(sal);		
	}
	
	
	@Path("/employee/id/{id}")
	@GET	
	@Produces(MediaType.APPLICATION_XML)
	public employee by_id(@PathParam("id")int id,@Context UriInfo uri)
	{
		Links object=new Links(uri.getAbsolutePath().toString());
		employee emp= obj.get_by_id(id);
		emp.setLink(object);
		return emp;
	}
	
	
}
