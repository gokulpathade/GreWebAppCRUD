package com.login.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.login.entity.User;
import com.login.repository.UserLogin;
import com.login.repository.UserRepository;

 
public class UserService implements UserDetailsService {

	@Autowired
	private UserRepository userRepo;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		 Optional<User> user= userRepo.findByUsername(username);
   User u = user.orElseThrow(()->new  UsernameNotFoundException("user not found"));
    return new UserLogin (u ); 
	
	}
	
	
	
}
