package com.gre.crudoperation.UserRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gre.crudoperation.Entity.FinancialTargetChangeLog;

@Repository
public interface FinancialTargetChangeLogRepository extends JpaRepository<FinancialTargetChangeLog, Integer> {

}
