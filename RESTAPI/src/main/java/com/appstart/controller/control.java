package com.appstart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.appstart.entity.products;
import com.appstart.services.SERVICE_LAYER;

@RestController
@RequestMapping("/api/products")
public class control{
	@Autowired
 SERVICE_LAYER se;

@PostMapping(value="/save",consumes= {MediaType.APPLICATION_XML_VALUE,MediaType.APPLICATION_JSON_VALUE})
public String save(@RequestBody products pro)
{
return se.save(pro);
}

@GetMapping(value="/getall",produces= {MediaType.APPLICATION_XML_VALUE})
public ResponseEntity<List<products>> value()
{   
	List<products> pro=se.retrive();
	HttpHeaders obj=new HttpHeaders();
	if(pro!=null)
	{
		obj.add("desc","retrived_shop_cart_items");
		return ResponseEntity.status(HttpStatus.OK).headers(obj).body(pro);
	}
	else
	{
		obj.add("DESC","NotFoundInDb");
		return ResponseEntity.status(HttpStatus.NO_CONTENT).headers(obj).build();
	}
}

@GetMapping(value="/retrive/value/{id}",produces= {MediaType.APPLICATION_XML_VALUE})
public ResponseEntity<products>get(@PathVariable("id")int id)
{
	products pro=se.getbyid(id);
	HttpHeaders obj=new HttpHeaders();
	if(pro!=null)
	{
	obj.add("GET","products_details_retrived");
	return new ResponseEntity(pro,obj,HttpStatus.FOUND);
	}
	else
	{
		obj.add("GET","value not in DB");
		return ResponseEntity.status(HttpStatus.NO_CONTENT).headers(obj).build();
	}
}

@DeleteMapping
@RequestMapping("/delete/{id}")
public String del(@PathVariable ("id") int id)
{
return se.delete(id);	
}

@PutMapping
@RequestMapping("/update/{id}")
public String update(@PathVariable("id")int id,@RequestParam ("price") double price)
{
	return se.update(id,price);
	
}

@PostMapping
@RequestMapping("/all/save")
public String details(@RequestBody List <products> pro)
{
	return se.savefull(pro);
}


}
