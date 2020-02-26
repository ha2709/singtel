package com.example.rest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController; 

@RestController
 

public class Rest
{

	@RequestMapping(method = RequestMethod.GET,value = "/" )
	public String index() {
		System.out.println("Rest Called");
		return "Hello Rest";
	}
	
	@RequestMapping(method = RequestMethod.GET,value = "/rest")
	public String name() {
		return "Gia huy" ;
	} 
	
}
