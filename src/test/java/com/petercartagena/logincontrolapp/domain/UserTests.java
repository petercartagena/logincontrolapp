package com.petercartagena.logincontrolapp.domain;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import com.petercartagena.logincontrolapp.domain.User;

/*TODO Prueba inutil borrar*/

public class UserTests {

	private User	user;

	@Before
	public void setUp() throws Exception {
		user = new User();
	}

	@Test
	public void testSetAndGetUsername() {
		String testUsername = "peter";
		Assert.assertNull(user.getUserName());
		user.setUserName(testUsername);
		Assert.assertEquals(testUsername, user.getUserName());
	}

	@Test
	public void testSetAndGetPassword() {
		String testPassword = "1234";
		Assert.assertNull(user.getPassword());
		user.setPassword(testPassword);
		Assert.assertEquals(testPassword, user.getPassword());
	}

}
