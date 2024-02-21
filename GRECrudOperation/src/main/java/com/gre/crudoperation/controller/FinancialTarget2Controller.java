package com.gre.crudoperation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gre.crudoperation.Entity.FinancialTarget2;
import com.gre.crudoperation.service.FinancialTarget2Service;

@RequestMapping("/api")
@RestController
public class FinancialTarget2Controller {

	@Autowired
	private FinancialTarget2Service ft2Service;

	/**
	 * ADD NEW FINANCIAL TARGET
	 * 
	 * @param ft2
	 * @return
	 */

	@PostMapping("/addft2Data")
	public FinancialTarget2 addFinancialTarget2Data(@RequestBody FinancialTarget2 ft2) {
		return ft2Service.addFinancialTarget2(ft2);
	}

	/**
	 * GET ALL FinancialTarget DATA HERE
	 * 
	 * @param ft2
	 * @return
	 */
	@GetMapping("/getFt2Data")
	public List<FinancialTarget2> getFinancialTarget2(FinancialTarget2 ft2) {
		return ft2Service.getFinancialTarget2(ft2);
	}

	/**
	 * GET FinancialTarget DATA HERE using targetid2
	 * 
	 * @param ft2
	 * @return
	 */
	@GetMapping("/getft2ById/{targetid2}")
	public FinancialTarget2 getFinancialTargetById(@PathVariable("targetid2") Long targetid2) {
		return ft2Service.getFinancialTargetById(targetid2);
	}

	/**
	 * Update FinancialTarget DATA HERE using targetid2
	 * 
	 * @param ft2
	 * @return
	 */
	@PutMapping("/updateft2Data/{targetid2}")
	public FinancialTarget2 updateFinancialTarget(@PathVariable("targetid2") Long targetid2,
			@RequestBody FinancialTarget2 ft2) {

		return ft2Service.updateFinancialTarget(targetid2, ft2);
	}

	/**
	 * Delete FinancialTarget DATA HERE using targetid2
	 * 
	 * @param ft2
	 * @return
	 */
	@DeleteMapping("/deleteFt2Data/{targetid2}")
	public String deleteFinancialTarget2(@PathVariable("targetid2") Long targetid2) {
		ft2Service.deleteFinancialTarget2(targetid2);
		return "Financial Target 2 id " + targetid2 + " Deleted Successfully";
	}

}
