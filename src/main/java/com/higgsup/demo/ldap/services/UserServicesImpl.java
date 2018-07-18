package com.higgsup.demo.ldap.services;

import javax.naming.Name;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ldap.core.LdapTemplate;
import org.springframework.ldap.support.LdapNameBuilder;
import org.springframework.stereotype.Service;

import com.higgsup.demo.ldap.entity.UserDetail;

@Service
public class UserServicesImpl implements UserServices {

	@Autowired
	private LdapTemplate ldapTemplate;

	@Override
	public UserDetail searchUserById(String uid) {
		Name dn = LdapNameBuilder.newInstance("dc=habuma,dc=com").add("ou", "people").add("uid", "ben").build();
		try {
			Object user = this.ldapTemplate.lookup(dn);
			System.out.println(user);
		} catch (Exception e) {
			String message = "Service searchUserById error: " + e;
			System.out.println(message);
		}
		return null;
	}

}
