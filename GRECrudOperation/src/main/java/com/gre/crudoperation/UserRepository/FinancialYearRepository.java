package com.gre.crudoperation.UserRepository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.gre.crudoperation.Entity.FinancialTarget2;
import com.gre.crudoperation.Entity.FinancialYear;

@Repository
public interface FinancialYearRepository extends JpaRepository<FinancialYear, Integer> {
	
	
	
	
	
	
	
	
	
	
	/*
	 * FIND DATA USING DATE 
	 * 
	 */
//		@Query(value = "SELECT * FROM financialYear WHERE date BETWEEN ?1 AND ?2", nativeQuery = true)
//		public List<FinancialYear> findFinancialTarget2Date(Date startDate, Date endDate);
//}

}
