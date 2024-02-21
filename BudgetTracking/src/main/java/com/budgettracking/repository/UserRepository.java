package com.budgettracking.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.budgettracking.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{

	Optional<User>findByEmail(String email);
	
//    User findByRole(Role role);
}
