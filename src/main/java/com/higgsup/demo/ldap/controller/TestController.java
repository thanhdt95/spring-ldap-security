package com.higgsup.demo.ldap.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class TestController {
	
	@GetMapping("/api")
	public static String getDataTest() {
		return "this is test data";
	}
	
}
