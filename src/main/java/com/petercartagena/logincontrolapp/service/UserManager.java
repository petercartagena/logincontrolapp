package com.petercartagena.logincontrolapp.service;

import java.util.List;

import com.petercartagena.logincontrolapp.domain.User;

public interface UserManager {

	public void changeUser(User user, User newUser);

	public List<User> getUsers();
	
	public void createUser(String user, String password, boolean enable);

}
