package com.petercartagena.logincontrolapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.petercartagena.logincontrolapp.domain.User;
import com.petercartagena.logincontrolapp.repository.UserDao;

public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao dao;
	
	public List<User> getUser() {
		return dao.getUsers();
	}

	public User getUser(String username, String password) {
		// TODO Auto-generated method stub
		return null;
	}

}
