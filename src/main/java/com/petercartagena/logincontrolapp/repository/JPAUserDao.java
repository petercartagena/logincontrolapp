package com.petercartagena.logincontrolapp.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.petercartagena.logincontrolapp.domain.User;

/*Indica que es una clase relacionada con la capa de persisitencia y que debe ser singleton*/
/*Spring anotation*/
@Repository(value = "userDao")
public class JPAUserDao implements IJPAUserDao {

	private EntityManager	em	= null;
	
	/*
	 * Sets the entity manager.
	 */
	@PersistenceContext
	public void setEntityManager(EntityManager em) {
		this.em = em;

		System.out.println("ENTITYMANAGER: INYECTED");
	}

	/*
	 * Estamos indicando que el m�todo en cuesti�n es transaccional. Lo que har�
	 * Spring es comprobar si ya existe una transacci�n abierta, si existe se
	 * unir� a ella, y si no existe, abrir� una nueva transacci�n (este
	 * comportamiento es configurable). De esta forma nos aseguramos que toda
	 * operaci�n de la base de datos se realiza dentro de una transacci�n.
	 * Adem�s si durante la ejecuci�n del m�todo se produce alguna excepci�n de
	 * Runtime, se har� autom�ticamente rollback de la transacci�n (este
	 * comportamiento tambi�n es configurable).
	 */

	@Transactional
	@SuppressWarnings("unchecked")
	public List<User> getUsersList() {
		return em.createNativeQuery(Queries.GET_ALL_USERS).getResultList();
	}

	@Transactional(readOnly = false)
	public void saveUser(User user) {
		em.merge(user);
	}

	public void createUser(String user, String password, boolean enable) {
		 em.createNativeQuery(Queries.CREATE_NEW_USER);
	}

	public User getUserFromDataBase(String username) {
		List<User> usersList =  em.createNativeQuery(Queries.GET_ALL_USERS).getResultList();
		System.out.println("size: " + usersList.size());
		System.out.println("elemento: " + usersList.get(1).getUserName());
		User user = new User();
		user = usersList.get(1);
		System.out.println("user: " + user.getUserName());
		
		return user;
	}

}
