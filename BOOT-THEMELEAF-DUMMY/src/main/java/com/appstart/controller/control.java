package com.appstart.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.appstart.model.*;
import com.appstart.service.ser;
@Controller
@RequestMapping("/student")
public class control {
	@Autowired
	private ser se;
   @GetMapping("/index")
	private String index(Model mod)
	{
		mod.addAttribute("stud",new student());
		mod.addAttribute("values", dept());
		return "register";
	}
   @PostMapping("/details")
   private ModelAndView method(@ModelAttribute("stud") student stu)
   {
	   ModelAndView mod=new ModelAndView();
	   if(stu==null)
	   {
		 mod.addObject("stud", stu);
		 mod.addObject("values",dept());
	     mod.setViewName("register");
	     return mod;
	   }
	   else
	   {
		   se.add(stu);
		   List<student>user=se.getdetails();
		   mod.addObject("allUsers", user);
		   mod.setViewName("details");
		   return mod;
	   }
   }
   
	private List<String>dept()
	{
		List<String>de=new ArrayList();
		de.add("CSC");
		de.add("IT");
		de.add("MECH");
		de.add("ECE");
		de.add("EEE");
		return de;
	}
}
