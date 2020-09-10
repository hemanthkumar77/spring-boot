package com.appstart.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.appstart.model.employee;

@Controller
@RequestMapping("/value")
public class control {

	@RequestMapping("/index")
	@GetMapping
	public String index(Model mod)
	{
		employee object=new employee();
		object.setId(103);
		object.setName("joker");
		
		List<employee> obj=new ArrayList();
		obj.add(new employee(101,"jigsaw"));
		obj.add(new employee(102,"batman"));
		obj.add(new employee(104,"daredevil"));
		obj.add(new employee(105,"killer"));
		mod.addAttribute("list",obj);
		mod.addAttribute("object",object);
		return "index";
	}
}
