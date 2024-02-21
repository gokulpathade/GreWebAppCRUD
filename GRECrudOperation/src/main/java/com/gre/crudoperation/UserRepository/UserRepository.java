package com.gre.crudoperation.UserRepository;

import java.util.Date;
import java.util.List;

//import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.gre.crudoperation.Entity.Notification;
import com.gre.crudoperation.Entity.User;




@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
//	public List<User> getAllUserDetails();
//	
//	@Query(value = "select * from user where userid = ?;", nativeQuery = true)
//	User findUsername(int userid);
//	
//	
	
	
	
	
	
	
	

}
