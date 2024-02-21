package com.gre.crudoperation.service;

import java.lang.StackWalker.Option;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gre.crudoperation.Entity.FinancialTargetChangeLog;
import com.gre.crudoperation.UserRepository.FinancialTargetChangeLogRepository;

@Service
public class FinancialTargetChangeLogService {

	@Autowired
	private FinancialTargetChangeLogRepository ftclRepo;
	
	/*
	 * ADD NEW DATA HERE 
	 * STORE NEW REQUEST DATA 
	 */
	public FinancialTargetChangeLog addFinancialTargetChangeLog(FinancialTargetChangeLog ftcl) {
		return ftclRepo.save(ftcl);
	}
	
	
	/*
	 * GET ALL DATA HERE 
	 * GET ALL DATA LIST 
	 */
	public List<FinancialTargetChangeLog> getAllFinancialTargetChangeLog() {
		return ftclRepo.findAll();
	}
	
	
	/*
	 * GET DATA HERE USING ID 
	 * GET REQUEST ID DATA 
	 */
	public FinancialTargetChangeLog getFinancialTargetChangeLogById(int ftclogid) {
		
		return ftclRepo.findById(ftclogid).get();
	}
	
	
	
	/*
	 * DELETE DATA HERE  USING ID
	 * DELETE REQUEST DATA 
	 */
	public void deleteFinancialTargetChangeLog(int ftclogid) {
		 ftclRepo.deleteById(ftclogid);
	}
	
	
	
	
	/*
	 * update DATA HERE 
	 * UPDATE REQUEST DATA 
	 */
	public FinancialTargetChangeLog updateFinancialTargetChangeLog(FinancialTargetChangeLog ftcl, int ftclogid) {
		
		Optional<FinancialTargetChangeLog> target= ftclRepo.findById(ftclogid);
       if (target.isPresent()) {
    	   FinancialTargetChangeLog alreadyexist =target.get();
    	   
    	   alreadyexist.setDate(ftcl.getDate());
    	   alreadyexist.setLog_date(ftcl.getLog_date());
    	   alreadyexist.setQ1(ftcl.getQ1());
    	   alreadyexist.setQ2(ftcl.getQ2());
    	   alreadyexist.setQ3(ftcl.getQ3());
    	   alreadyexist.setQ4(ftcl.getQ4());
    	   alreadyexist.setYear_target(ftcl.getYear_target());
    	   
    	   return ftclRepo.save(alreadyexist);
       }
       else {
    	   throw new IllegalArgumentException("FinancialTargetChangeLog id "+ ftclogid  + " NOT FOUND");
       }
		
		
	}
	
	
	
	
}
