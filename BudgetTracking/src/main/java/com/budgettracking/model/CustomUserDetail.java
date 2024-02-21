package com.budgettracking.model;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

//import com.budgettracking.service.collection;

public class CustomUserDetail implements UserDetails {

	
	
	

	private String username;
	private String password;
	private Collection <? extends GrantedAuthority> authorities;
	private String fullname;
	
	
	
	
	
	
	
	
	/**
	 * @param username
	 * @param password
	 * @param authorities
	 * @param fullname
	 */
	public CustomUserDetail(String username, String password, Collection<? extends GrantedAuthority> authorities,
			String fullname) {
		
		this.username = username;
		this.password = password;
		this.authorities = authorities;
		this.fullname = fullname;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return authorities;
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return getPassword();
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return getUsername();
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
