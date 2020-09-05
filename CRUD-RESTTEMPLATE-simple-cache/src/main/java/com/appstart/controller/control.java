package com.appstart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.appstart.entity.products;
import com.appstart.services.SERVICE_LAYER;

@RestController
@RequestMapping("/api/products")
public class control {
	@Autowired
 SERVICE_LAYER se;
@PostMapping
@RequestMapping("/save")
public String save(@RequestBody products pro)
{
return se.save(pro);
}

@GetMapping
@RequestMapping("/getall")
public @ResponseBody Iterable<products> value()
{
	return se.retrive();
}

@GetMapping
@RequestMapping("/retrive/value/{id}")
public @ResponseBody products get(@PathVariable("id")int id)
{
	return se.getbyid(id);
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
