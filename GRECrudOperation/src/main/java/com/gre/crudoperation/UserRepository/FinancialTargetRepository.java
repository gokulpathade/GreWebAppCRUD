package com.gre.crudoperation.UserRepository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.gre.crudoperation.Entity.FinancialTarget;


@Repository
public interface FinancialTargetRepository extends JpaRepository<FinancialTarget, Integer> {
	
	
	/*
	 * FIND DATA USING DATE 
	 * 
	 */
		@Query(value = "SELECT * FROM financial_target WHERE date BETWEEN ?1 AND ?2", nativeQuery = true)
		public List<FinancialTarget> findFinancialTargetDate(Date startDate, Date endDate);

	

}
