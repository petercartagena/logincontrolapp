package com.petercartagena.logincontrolapp.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.dao.DataAccessException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.transaction.annotation.Transactional;

import com.petercartagena.logincontrolapp.repository.UserDao;

@Transactional(readOnly = true)
public class CustomUserDetailsService implements UserDetailsService {

	protected final Log		logger	= LogFactory.getLog(getClass());
	
	private UserDao userDao;
	
	public UserDetails loadUserByUsername(String arg0) throws UsernameNotFoundException, DataAccessException {
		// TODO Auto-generated method stub
		
		UserDetails user = null;
		
		System.out.println("USERNAME: " + arg0);
		
		
		return null;
	}

}
