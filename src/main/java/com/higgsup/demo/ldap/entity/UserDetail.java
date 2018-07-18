package com.higgsup.demo.ldap.entity;

import javax.naming.Name;

import org.springframework.ldap.odm.annotations.Attribute;
import org.springframework.ldap.odm.annotations.Entry;
import org.springframework.ldap.odm.annotations.Id;

@Entry(objectClasses = { "inetOrgPerson" }, base = "ou=people")
public class UserDetail {

	@Id
	private Name uid;

	@Attribute(name = "userPassword")
	private String password;

	@Attribute(name = "sn")
	private String surName;
	
	@Attribute(name = "cn")
	private String commonName;

	private String role;

	public UserDetail() {
		super();
	}

	public UserDetail(Name uid, String password, String role, String surName, String commonName) {
		super();
		this.uid = uid;
		this.password = password;
		this.role = role;
		this.surName = surName;
		this.commonName = commonName;
	}

	public Name getUid() {
		return uid;
	}

	public void setUid(Name uid) {
		this.uid = uid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}

	public String getCommonName() {
		return commonName;
	}

	public void setCommonName(String commonName) {
		this.commonName = commonName;
	}

}
