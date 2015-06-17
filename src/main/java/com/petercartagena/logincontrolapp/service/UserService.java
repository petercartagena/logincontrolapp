package com.petercartagena.logincontrolapp.service;

import java.util.List;

import com.petercartagena.logincontrolapp.domain.User;

public interface UserService {

	public List<User> getUser();

	public User getUser(String username, String password);
}
