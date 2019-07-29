package com.pac.domain;

import java.util.List;

public class UserList {
	private List<User> userList;

	public UserList() {

	}

	public UserList(User user) {
		this.userList.add(user);
	}

	public UserList(List<User> userList) {
		setUserList(userList);
	}

	public List<User> getUserList() {
		return this.userList;
	}

	public void setUserList(List<User> userList) {
		for (User user : userList) {
			this.userList.add(user);
		}
	}

	private void addUser(User user) {
		// TODO Auto-generated method stub
		userList.add(user);
	}
}
