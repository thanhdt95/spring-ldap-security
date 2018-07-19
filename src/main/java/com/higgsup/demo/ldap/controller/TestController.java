package com.higgsup.demo.ldap.controller;


import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin("*")
public class TestController {

	@GetMapping(ControllerConfigure.BASE_API_URL)
	public @ResponseBody String getDataTest() {
		return "this is test data";
	}

	@GetMapping(ControllerConfigure.BASE_API_URL + "/users")
	public String geUserTest() {
		Object object = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		return object.toString();
	}

}
