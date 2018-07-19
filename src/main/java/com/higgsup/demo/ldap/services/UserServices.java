package com.higgsup.demo.ldap.services;

import com.higgsup.demo.ldap.entity.User;

public interface UserServices {
	
	public User searchUserById(String uid);
	
}
