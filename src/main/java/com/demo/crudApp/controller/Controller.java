package com.demo.crudApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@GetMapping("/hello")
	public String hello() {
		return "HELLO WORLD!!!!!!!!!!";
	}
	
}
