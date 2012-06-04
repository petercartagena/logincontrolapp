package com.petercartagena.logincontrolapp.repository;

import java.util.ArrayList;
import java.util.List;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.petercartagena.logincontrolapp.domain.User;

public class JPAUserDaoTests {

	private IJPAUserDao	userDao;

	
/*TODO El contexto no se encuentra.*/	
	@Before
	public void setUp() throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext("test-context.xml");
		userDao = (IJPAUserDao) context.getBean("userDao");
	}

	@Test
	public void testGetUserList() {
		List<User> users = new ArrayList<User>();
		users = userDao.getUsersList();
		Assert.assertEquals(users.size(), 3);
	}

	@Test
	public void testSaveUser() {
		User user = new User();
		user.setUserName("josejuan");
		user.setPassword("1234");
		user.setEnable(true);
		userDao.saveUser(user);

		Assert.assertEquals(userDao.getUsersList().size(), 4);
	}

	// @After
	// private void tear() throws Exception{
	//
	// }

}
