package com.petercartagena.logincontrolapp.repository;

import java.util.Iterator;
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
	 * Estamos indicando que el método en cuestión es transaccional. Lo que hará
	 * Spring es comprobar si ya existe una transacción abierta, si existe se
	 * unirá a ella, y si no existe, abrirá una nueva transacción (este
	 * comportamiento es configurable). De esta forma nos aseguramos que toda
	 * operación de la base de datos se realiza dentro de una transacción.
	 * Además si durante la ejecución del método se produce alguna excepción de
	 * Runtime, se hará automáticamente rollback de la transacción (este
	 * comportamiento también es configurable).
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
		User user = new User();
		user = usersList.get(1);
		System.out.println("user: " + user.getUserName());
		
		return user;
	}

}
