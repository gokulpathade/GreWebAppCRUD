package com.gre.crudoperation.UserRepository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gre.crudoperation.Entity.FinancialTarget1;


@Repository
public interface FinancialTarget1Repository extends JpaRepository<FinancialTarget1, Long> {
	
	
}
