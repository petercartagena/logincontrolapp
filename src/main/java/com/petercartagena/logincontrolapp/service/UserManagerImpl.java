package com.petercartagena.logincontrolapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.petercartagena.logincontrolapp.domain.User;

public class UserManagerImpl implements UserManager{

	@Autowired
	private UserService userService;
	
	public void changeUser(User user, User newUser) {
		// TODO Auto-generated method stub
	}

	public List<User> getUsers() {
		return userService.getUser();
	}

	public void createUser(String user, String password, boolean enable) {
		// TODO Auto-generated method stub
		
	}

}
