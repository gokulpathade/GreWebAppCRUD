package com.gre.crudoperation.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gre.crudoperation.Entity.FinancialYear;
import com.gre.crudoperation.UserRepository.FinancialYearRepository;

@Service
public class FinancialYearService {

	
	@Autowired
	private FinancialYearRepository financialRepo;
	
	/*
	 * SAVE NEW DATA HERE 
	 * ADD NEW DATA 
	 */
	public FinancialYear addFinancialYearData(FinancialYear financialyear) {
		return financialRepo.save(financialyear);
		
	}
	
	
	/*
	 * GET ALL DATA HERE 
	 * FETCH ALL DATA 
	 */
	public List<FinancialYear> getFinancialYearData() {
		return financialRepo.findAll();
		
	}
	
	
	
	/*
	 * FETCH DATA HERE USING  ID 
	 *   GET DATA USING ID  
	 */
	public FinancialYear getFinancialYearById(int financial_id) {
		return financialRepo.findById(financial_id).get();
		
	}
	
	
	/*
	 *  DELETE DATA HERE USING ID  
	 *  DELETE DATA HERE USING FinancialYear ID  
	 */
	public void deleteFinancialYearData(int financial_id) {
		financialRepo.deleteById(financial_id);
		
	}
	
	
	
	/*
	 * UPDATE DATA HERE USING ID 
	 *  UPDATE DATA USING FinancialYear ID
	 */
	public FinancialYear updateFinancialYearData(FinancialYear financialyear, int financial_id) {
		
		Optional<FinancialYear> target = financialRepo.findById(financial_id);
		if (target.isPresent())
		{
			FinancialYear alreadyexist = target.get();
			
			alreadyexist.setDate(financialyear.getDate());
			alreadyexist.setOffshort(financialyear.getOffshort());
			alreadyexist.setOn_site(financialyear.getOn_site());
			alreadyexist.setTotal(financialyear.getTotal());
			
			return financialRepo.save(alreadyexist);
		}else {
			throw new IllegalArgumentException("FinancialYear Id "+ financial_id + " Not Found ");
		}
		
	}
	
	
	
}
