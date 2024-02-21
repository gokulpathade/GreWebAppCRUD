package com.gre.crudoperation.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gre.crudoperation.Entity.FinancialTarget1;
import com.gre.crudoperation.UserRepository.FinancialTarget1Repository;

@Service
public class FinancialTarget1Service {
	
	@Autowired
	private FinancialTarget1Repository ft1Repo;
	
	
	
	
	
	/** ADD NEW FINANCIAL TARGET
	 * @param ft1
	 * @return
	 */
	
	public  FinancialTarget1 addFinancialTarget1(FinancialTarget1 ft1) {
	
		return ft1Repo.save(ft1);
		
	}
	
	
	
	/** GET ALL FinancialTarget DATA HERE  
	 * @param ft1
	 * @return
	 */
	public List<FinancialTarget1>  getFinancialTarget1(FinancialTarget1 ft1) {
		return ft1Repo.findAll();
	}
	
	

	/** GET FinancialTarget DATA HERE using  targetid1
	 * @param ft1
	 * @return
	 */

	public FinancialTarget1  getFinancialTargetById(Long targetid1) {
		return ft1Repo.findById(targetid1).get();
	}
	

	
	/** Update FinancialTarget DATA HERE using  targetid1
	 * @param ft1
	 * @return
	 */

	public FinancialTarget1  updateFinancialTarget( Long targetid1, FinancialTarget1 ft1) {
		
		Optional<FinancialTarget1> targetOptional = ft1Repo.findById(targetid1);
		
		
	
//	FinancialTarget1 alreadyExist = getFinancialTarget1(targetid1);
		if (targetOptional.isPresent()) {
			  FinancialTarget1 alreadyExist = targetOptional.get();
			alreadyExist.setApr(ft1.getApr());
			alreadyExist.setAug(ft1.getAug());
			alreadyExist.setCategory(ft1.getCategory());
			alreadyExist.setDecember(ft1.getDecember());
			alreadyExist.setFeb(ft1.getFeb());
			alreadyExist.setJan(ft1.getJan());
			alreadyExist.setJuly(ft1.getJuly());
			alreadyExist.setJune(ft1.getJune());
			alreadyExist.setLocation(ft1.getLocation());
			alreadyExist.setMar(ft1.getMar());
		
			alreadyExist.setMay(ft1.getNov());
			
			alreadyExist.setYear_id(ft1.getYear_id());
//			alreadyExist.setUser_id(ft1.getUser_id());
			alreadyExist.setSept(ft1.getSept());
			alreadyExist.setNov(ft1.getNov());
			alreadyExist.setOct(ft1.getOct());
			
			return ft1Repo.save(alreadyExist);
//			 apr, aug, category, december, feb, jan, july, june, location, mar, may, nov, oct, sept, user_id, year_id
			
		}
		
		else {
	        // If the target with the specified ID is not found, throw an exception
	        throw new IllegalArgumentException("FinancialTarget1 with ID " + targetid1 + " not found");
	    }
	}
	
	

	
	
	

	/** Delete FinancialTarget DATA HERE using  targetid1
	 * @param ft1
	 * @return
	 */

	public void  deleteFinancialTarget1(Long targetid1) {
		 ft1Repo.deleteById(targetid1);
	}




}
