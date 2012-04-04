package com.petercartagena.logincontrolapp.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.petercartagena.logincontrolapp.domain.User;

@Repository(value = "userDao")
public class JPAUserDao implements UserDao {

	private EntityManager	em	= null;

	/*
	 * Sets the entity manager.
	 */
	@PersistenceContext
	public void setEntityManager(EntityManager em) {
		this.em = em;
		System.out.println("ENTITYMANAGERINYECTED: " + em);
	}

	@Transactional
	@SuppressWarnings("unchecked")
	public List<User> getUsersList() {
		return em.createNativeQuery(Queries.GET_ALL_USERS).getResultList();
	}

	@Transactional(readOnly = false)
	public void saveUser(User user) {
		em.merge(user);
	}

}
