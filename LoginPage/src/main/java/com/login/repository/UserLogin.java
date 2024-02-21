package com.login.repository;

import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.login.entity.User;

public class UserLogin implements UserDetails {

	
	
	
	
	
	final private User U;
	
	/**
	 * @param u
	 */
	public UserLogin(User u) {
//		super();
	this.U = u;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return List.of(()->   "read" );
		
		
		
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		
		return U.getPassword();
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return U.getusername();
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

}
