package com.higgsup.demo.ldap.controller;


import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.higgsup.demo.ldap.entity.User;

@RestController
@CrossOrigin("*")
public class UserController {
	
//	@Autowired
//    AuthenticationManager authenticationManager;
//	
//	@PostMapping(ControllerConfigure.BASE_LOGIN_URL)
//	public @ResponseBody Map<String, Object> doLogin(@RequestBody UserDetail userDetail) {
//		Map<String, Object> result = new HashMap<String, Object>();
//		return result;
//		
//	}
	
}
