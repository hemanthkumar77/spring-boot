package com.appstart.controller;

import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class control implements ErrorController {
private static final String  PATH="/error";
@RequestMapping("/index")
@GetMapping
public String method()
{
	return "welcome to the test page";
}
@RequestMapping(value=PATH)
@GetMapping
public String errormessage()
{
	return "sorry page not found ";
}
	@Override
	public String getErrorPath() {
		// TODO Auto-generated method stub
		return null;
	}

}
