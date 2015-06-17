package com.petercartagena.logincontrolapp.service;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration("/test-context.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class UserManagerTest {

	@Autowired
	private UserManager userManager;
	
	@Test
	public void getUsers(){
		Assert.assertNotNull(userManager.getUsers());
	}
	
}
