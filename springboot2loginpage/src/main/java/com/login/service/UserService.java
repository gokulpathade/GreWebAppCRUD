package com.login.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.stereotype.Service;

import com.login.entity.User;

@Service
public class UserService {

	
	@Autowired
	UserDetailsManager udManager;
	
	public void saveUser(User u) {
		udManager.createUser(u);
	}
}
