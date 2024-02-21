package com.login.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class User {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int uId;
private String username;
//private String uEmail;
private String password;
/**
 * 
 */
public User() {
	super();
	// TODO Auto-generated constructor stub
}
/**
 * @param uId
 * @param username
 * @param password
 */
public User(int uId, String username, String password) {
	super();
	this.uId = uId;
	this.username = username;
	this.password = password;
}
/**
 * @return the uId
 */
public int getuId() {
	return uId;
}
/**
 * @param uId the uId to set
 */
public void setuId(int uId) {
	this.uId = uId;
}
/**
 * @return the username
 */
public String getusername() {
	return username;
}
/**
 * @param username the username to set
 */
public void setusername(String username) {
	this.username = username;
}
/**
 * @return the password
 */
public String getPassword() {
	return password;
}
/**
 * @param password the password to set
 */
public void setPassword(String password) {
	this.password = password;
}


@Override
public String toString() {
	return "User [uId=" + uId + ", username=" + username + ", password=" + password + "]";
}












}
