package com.petercartagena.logincontrolapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import com.petercartagena.logincontrolapp.domain.User;
import com.petercartagena.logincontrolapp.repository.UserDao;

@Service
public class SimpleUserManager implements IUserManager {

	/**
	 * 
	 */
	private static final long	serialVersionUID	= 1L;

	
	@Autowired
	private UserDao				userDao;
	private List<User>			users;

	private ApplicationContext	context;

	public void setUserDao(UserDao userdao) {
		this.userDao = userdao;
	}

	public void changeUser(User user, User newUser) {
		users.remove(user);
		users.add(newUser);
	}

	public List<User> getUsers() {
		// return users;
		return userDao.getUsersList();
	}

	/* Not implemented */
	public void setUsers(List<User> list) {
		this.users = list;
	}

}
