package com.higgsup.demo.ldap.entity;

import java.util.List;

public class Group {
	
	private List<UserDetail> listUser;
	
	private String groupName;
	
	public Group() {
		super();
	}

	public Group(List<UserDetail> listUser, String groupName) {
		super();
		this.listUser = listUser;
		this.groupName = groupName;
	}

	public List<UserDetail> getListUser() {
		return listUser;
	}

	public void setListUser(List<UserDetail> listUser) {
		this.listUser = listUser;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	
	
	
}
