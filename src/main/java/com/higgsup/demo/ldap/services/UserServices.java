package com.higgsup.demo.ldap.services;

import com.higgsup.demo.ldap.entity.UserDetail;

public interface UserServices {
	
	public UserDetail searchUserById(String uid);
	
}
