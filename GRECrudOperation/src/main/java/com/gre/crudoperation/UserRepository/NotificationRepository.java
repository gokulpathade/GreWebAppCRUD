package com.gre.crudoperation.UserRepository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.gre.crudoperation.Entity.Notification;

public interface NotificationRepository extends JpaRepository<Notification, Integer> {
	
	
     /*
      * FIND DATE WISE DATA 
      */
	@Query(value = "SELECT * FROM notification WHERE created_at BETWEEN ?1 AND ?2", nativeQuery = true)
	public List<Notification> findcreated_atDate(Date startDate, Date endDate);

	
	
	
	
}
