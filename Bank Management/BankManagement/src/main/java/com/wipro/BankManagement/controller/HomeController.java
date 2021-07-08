package com.wipro.BankManagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String home() {
		return "redirect:/welcome";
	}
	
	@RequestMapping("/welcome")
	public String index() {
		return "index";
	}
	
	

}
