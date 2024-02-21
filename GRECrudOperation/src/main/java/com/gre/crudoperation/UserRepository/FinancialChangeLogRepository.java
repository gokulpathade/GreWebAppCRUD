package com.gre.crudoperation.UserRepository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.gre.crudoperation.Entity.FinancialChangeLog;


@Repository
public interface FinancialChangeLogRepository extends JpaRepository<FinancialChangeLog, Integer> {
	
	
/*
 * FIND DATA USING DATE 
 * 
 */
	@Query(value = "SELECT * FROM financial_change_log WHERE date BETWEEN ?1 AND ?2", nativeQuery = true)
	public List<FinancialChangeLog> findDate(Date startDate, Date endDate);


}
