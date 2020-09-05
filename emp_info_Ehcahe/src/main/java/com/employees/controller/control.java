package com.employees.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employees.entities.employee;
import com.employees.service.service;

@RestController
@RequestMapping(value="/api/employees")
public class control {
    @Autowired
	private service ser;
   @PostMapping(value="/create")
    public employee create(@RequestBody employee emp)
    {
    	return ser.createemployee(emp);
    }
   
   @GetMapping(value="/hr/{emp_id}")
   public employee findeemployee(@PathVariable("emp_id")int emp_id)
   {
	   return ser.finddetails(emp_id);
   }
    
  @GetMapping(value="/all")
  public Iterable<employee>getall()
  {
	  return ser.getall();
  }
  
  @DeleteMapping(value="/delete/{emp_id}")
  public void delete(@PathVariable ("emp_id") int id)
  {
	  ser.delete(id);
  }
  
  @PutMapping(value="/update/{emp_id}/{emp_salary}")
  public void update(@PathVariable Map<String,String>obj)
  {
	  int emp_id=Integer.parseInt(obj.get("emp_id"));
	  double sal=Double.parseDouble(obj.get("emp_salary"));
      ser.update(emp_id,sal);
  }
}
