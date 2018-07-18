package com.higgsup.demo.ldap.controller;


import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class UserController {
	
	
	@GetMapping("/login")
	public String login() {

		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		String name = auth.getName(); // get logged in username
		System.out.println(name + ": " + auth.getCredentials());
		return "redirect:/api";

	}
	
	@GetMapping("/logout")
	public String logout() {
		return "redirect:/login";
	}
}
