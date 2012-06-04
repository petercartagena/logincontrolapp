package com.petercartagena.logincontrolapp.repository;

import java.util.List;

import com.petercartagena.logincontrolapp.domain.User;

public interface IJPAUserDao {

	public abstract List<User> getUsersList();

	public abstract void saveUser(User user);

	public abstract void createUser(String user, String password, boolean enable);
	
	public User getUserFromDataBase(String username);
	
}
