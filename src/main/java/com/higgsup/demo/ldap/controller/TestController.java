package com.higgsup.demo.ldap.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.higgsup.demo.ldap.entity.User;
import com.higgsup.demo.ldap.services.UserServices;

@RestController
@CrossOrigin("*")
public class TestController {


	@Autowired
	private UserServices userServices;

	@GetMapping(ControllerConfigure.BASE_API_URL)
	public String getDataTest() {
		return "this is test data";
	}

//	@GetMapping(ControllerConfigure.BASE_API_URL + "/getUser")
//	public UserDetail geUserTest() {
//		UserDetail user = this.userServices.searchUserById("ben");
//		System.out.println(user.getUid() + ": " + user.getPassword());
//		return user;
//	}

}
