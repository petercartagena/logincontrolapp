package com.petercartagena.logincontrolapp.repository;

public class Queries {

	public static final String	GET_USER		= "SELECT id FROM `users` WHERE username='%username%' and password='%password%'";
	public static final String	GET_ALL_USERS	= "SELECT * FROM users WHERE 1";
	public static final String	SAVE_USER		= "INSERT INTO users (id, username, password) values (id, '%username%', '%password%')";
	public static final String	REMOVE_USER		= "DELETE FROM users WHERE username = '%username%' and password='%password%';";
	public static final String	CREATE_NEW_USER	= "INSERT INTO users (id, username, password, enable)";
	public static final String	GET_USER_ONLY	= "SELECT * FROM `users` WHERE username = 'peter'";
}
