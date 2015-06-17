package com.petercartagena.logincontrolapp.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*Declaramos que se trata de una entidad*/
@Entity
@Table(name = "users")
public class User implements Serializable {

	/**
	 * 
	 */
	private static final long	serialVersionUID	= 1L;
/*Indica que el id sera generado por la base de datos.*/
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="USER_ID")
	private Integer				userId;
	@Column(name="USERNAME")
	private String				userName;
	@Column(name="PASSWORD")
	private String				password;
	@Column(name="ENABLED")
	private boolean             enable;

	public boolean isEnable() {
		return enable;
	}

	public void setEnable(boolean enable) {
		this.enable = enable;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer id) {
		this.userId = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String username) {
		this.userName = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getAccess(){
		if(this.enable == true){
			return 1;
		}else{
			return 0;
		}
	}
	
}
