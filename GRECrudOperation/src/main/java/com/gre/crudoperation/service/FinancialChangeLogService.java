package com.gre.crudoperation.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gre.crudoperation.Entity.FinancialChangeLog;
import com.gre.crudoperation.Entity.FinancialTarget2;
import com.gre.crudoperation.UserRepository.FinancialChangeLogRepository;

@Service
public class FinancialChangeLogService {

	@Autowired
	private FinancialChangeLogRepository financialRepo;

	/*
	 * save NEW DATA HERE ADD DATA
	 * 
	 */

	public FinancialChangeLog saveData(FinancialChangeLog financial) {
		return financialRepo.save(financial);

	}

	/*
	 * GET ALL DATA HERE FIND ALL DATA
	 * 
	 */

	public List<FinancialChangeLog> getAllData() {
		return financialRepo.findAll();

	}

	/*
	 * GET DATA HERE USING BY ID GET DATA USING BY ID
	 * 
	 */

	public FinancialChangeLog getDataById(int fclogid) {
		return financialRepo.findById(fclogid).get();

	}

	/*
	 * DELETE DATA HERE USING BY ID DELETE DATA USING BY ID
	 * 
	 */

	public void deleteDataById(int fclogid) {
		financialRepo.deleteById(fclogid);

	}

	/*
	 * UPDATE DATA HERE UPDATA DATA
	 * 
	 */

	public FinancialChangeLog updateData(FinancialChangeLog financial, int fclogid) {

		Optional<FinancialChangeLog> targetOptional = financialRepo.findById(fclogid);

		if (targetOptional.isPresent()) {
			FinancialChangeLog alreadyExist = targetOptional.get();
			alreadyExist.setDate(financial.getDate());
			alreadyExist.setLog_date(financial.getLog_date());
			alreadyExist.setOffshort(financial.getOffshort());
			alreadyExist.setOn_site(financial.getOn_site());
			alreadyExist.setTotal(financial.getTotal());

			return financialRepo.save(alreadyExist);
		} else {
			throw new IllegalArgumentException("FinancialChangeLog with ID " + fclogid + " not found");
		}

	}

	/*
	 * GET DATA HERE USING TWO DATE BETWEEN TWO DATES
	 * 
	 */
	public List<FinancialChangeLog> findDate(Date startDate, Date endDate) {
		return financialRepo.findDate(startDate, endDate);
	}

}
