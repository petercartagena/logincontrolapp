package com.petercartagena.logincontrolapp.repository;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.petercartagena.logincontrolapp.domain.User;

@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	private SessionFactory sessionFactory;

    @SuppressWarnings("unchecked")
    @Transactional
	public List<User> getUsers() {
		return sessionFactory.getCurrentSession().createQuery("from User").list();
	}

	public User getUser(String username, String password) {
		return null;
	}

}
