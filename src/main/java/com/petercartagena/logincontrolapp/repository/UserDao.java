package com.petercartagena.logincontrolapp.repository;

import java.util.List;

import com.petercartagena.logincontrolapp.domain.User;

public interface UserDao {

	public abstract List<User> getUsersList();

	public abstract void saveUser(User user);
	
}
