package com.gbros.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class AppController {

	@GetMapping("/test")
	public String gelloWorld() {
		return "Hello World!";
	}
}