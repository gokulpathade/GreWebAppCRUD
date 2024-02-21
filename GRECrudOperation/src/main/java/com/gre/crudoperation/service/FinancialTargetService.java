package com.gre.crudoperation.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gre.crudoperation.Entity.FinancialTarget;
import com.gre.crudoperation.UserRepository.FinancialTargetRepository;

@Service
public class FinancialTargetService {

	@Autowired
	private FinancialTargetRepository ftRepo;

	/**
	 * SAVE FinancialTarget DATA HERE ADD NEW RESOURCE FinancialTarget
	 * 
	 * @return
	 */
	public FinancialTarget addFinancialTarget(FinancialTarget ft) {
		return ftRepo.save(ft);

	}

	/**
	 * GET ALL FinancialTarget DATA HERE GET ALL DATA IN LIST FinancialTarget
	 * 
	 * @return
	 */
	public List<FinancialTarget> getAllFinancialTarget() {
		return ftRepo.findAll();

	}

	/**
	 * GET FinancialTarget DATA HERE USING ID FinancialTarget DATA FETCH USING ID
	 * 
	 * @return
	 */
	public FinancialTarget getFinancialTargetById(int ftid) {
		return ftRepo.findById(ftid).get();

	}

	/**
	 * DELETE FinancialTarget DATA HERE DELETE FinancialTarget USING ID
	 * 
	 * @return
	 */
	public void deleteFinancialTarget(int ftid) {
		ftRepo.deleteById(ftid);

	}

	/**
	 *  UPDATE FinancialTarget DATA HERE USING ID 
	 * UPDATE EXIST RESOURCE FinancialTarget USING ID
	 * 
	 * @return
	 */
	public FinancialTarget updateFinancialTarget(FinancialTarget ft, int ftid) {
		
		Optional<FinancialTarget> target = ftRepo.findById(ftid);
		if(target.isPresent())
		{
			FinancialTarget alreadyExist = target.get();
			alreadyExist.setDate(ft.getDate());
			alreadyExist.setQ1(ft.getQ1());
			alreadyExist.setQ2(ft.getQ2());
			alreadyExist.setQ3(ft.getQ3());
			alreadyExist.setQ4(ft.getQ4());
			alreadyExist.setYear_target(ft.getYear_target());
			 return ftRepo.save(alreadyExist);
		}
		
		throw new IllegalArgumentException("FINANCIAL TARGET  ID "+ ftid + " NOT FOUND");
		
	}

	
	/**
	 *  GET DATA HERE USING DATE 
	 * FinancialTarget DATE USING DATE
	 * 
	 * @return
	 */
	
	public List<FinancialTarget> findFinancialTargetDate(Date startDate, Date endDate){
		return ftRepo.findFinancialTargetDate(startDate, endDate);
	}
	
	
}
