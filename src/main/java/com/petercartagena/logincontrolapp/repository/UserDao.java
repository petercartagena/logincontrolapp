package com.petercartagena.logincontrolapp.repository;

import java.util.List;

import com.petercartagena.logincontrolapp.domain.User;

public interface UserDao {

	public List<User> getUsersList();

	public void saveUser(User user);

}
