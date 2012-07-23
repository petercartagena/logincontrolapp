package com.petercartagena.logincontrolapp.repository;

import java.util.List;

import com.petercartagena.logincontrolapp.domain.User;

public interface IJPAUserDao {

	public List<User> getUsersList();

	public void saveUser(User user);

	public void createUser(String user, String password, boolean enable);
	
	public User getUserFromDataBase(String username);
	
}
