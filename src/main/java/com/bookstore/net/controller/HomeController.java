package com.bookstore.net.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController
{
	
	@RequestMapping(value="/")
	public String hello()
	{
		return "index";
	}
	
	// refactor   again

}
