package com.gre.crudoperation.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gre.crudoperation.Entity.FinancialTarget2;

import com.gre.crudoperation.UserRepository.FinancialTarget2Repository;

@Service
public class FinancialTarget2Service {

	@Autowired
	private FinancialTarget2Repository ft2Repo;

	/**
	 * ADD NEW FINANCIAL TARGET
	 * 
	 * @param ft2
	 * @return
	 */

	public FinancialTarget2 addFinancialTarget2(FinancialTarget2 ft2) {

		return ft2Repo.save(ft2);

	}

	/**
	 * GET ALL FinancialTarget DATA HERE
	 * 
	 * @param ft2
	 * @return
	 */
	public List<FinancialTarget2> getFinancialTarget2(FinancialTarget2 ft2) {
		return ft2Repo.findAll();
	}

	/**
	 * GET FinancialTarget DATA HERE using targetid2
	 * 
	 * @param ft2
	 * @return
	 */

	public FinancialTarget2 getFinancialTargetById(Long targetid2) {
		return ft2Repo.findById(targetid2).get();
	}

	/**
	 * Update FinancialTarget DATA HERE using targetid2
	 * 
	 * @param ft2
	 * @return
	 */

	public FinancialTarget2 updateFinancialTarget(Long targetid2, FinancialTarget2 ft2) {

		Optional<FinancialTarget2> targetOptional = ft2Repo.findById(targetid2);

//	FinancialTarget2 alreadyExist = getFinancialTarget2(targetid2);
		if (targetOptional.isPresent()) {
			FinancialTarget2 alreadyExist = targetOptional.get();
			alreadyExist.setApr(ft2.getApr());
			alreadyExist.setAug(ft2.getAug());
			alreadyExist.setCategory(ft2.getCategory());
			alreadyExist.setDecember(ft2.getDecember());
			alreadyExist.setFeb(ft2.getFeb());
			alreadyExist.setJan(ft2.getJan());
			alreadyExist.setJuly(ft2.getJuly());
			alreadyExist.setJune(ft2.getJune());
			alreadyExist.setLocation(ft2.getLocation());
			alreadyExist.setMar(ft2.getMar());

			alreadyExist.setMay(ft2.getNov());

			alreadyExist.setYear_id(ft2.getYear_id());

			alreadyExist.setSept(ft2.getSept());
			alreadyExist.setNov(ft2.getNov());
			alreadyExist.setOct(ft2.getOct());

			return ft2Repo.save(alreadyExist);
//			 apr, aug, category, december, feb, jan, july, june, location, mar, may, nov, oct, sept, user_id, year_id

		}

		else {
			// If the target with the specified ID is not found, throw an exception
			throw new IllegalArgumentException("FinancialTarget2 with ID " + targetid2 + " not found");
		}
	}

	/**
	 * Delete FinancialTarget DATA HERE using targetid2
	 * 
	 * @param ft2
	 * @return
	 */

	public void deleteFinancialTarget2(Long targetid2) {
		ft2Repo.deleteById(targetid2);
	}

}
