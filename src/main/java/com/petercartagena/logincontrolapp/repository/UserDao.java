package com.petercartagena.logincontrolapp.repository;

import java.util.List;

import com.petercartagena.logincontrolapp.domain.User;

public interface UserDao {

	public List<User> getUsers();

	public User getUser(String username, String password);
}
