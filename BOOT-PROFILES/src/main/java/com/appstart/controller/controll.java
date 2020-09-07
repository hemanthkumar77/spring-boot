package com.appstart.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controll {
@Value(value="${detail.id}")
private String name;

@GetMapping
@RequestMapping("/")
public String method()
{
	return name;
}

}
