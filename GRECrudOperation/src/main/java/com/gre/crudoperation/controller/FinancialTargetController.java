
package com.gre.crudoperation.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gre.crudoperation.Entity.FinancialChangeLog;
import com.gre.crudoperation.Entity.FinancialTarget;
import com.gre.crudoperation.service.FinancialTargetService;

@RestController
@RequestMapping("/api")
public class FinancialTargetController {

	@Autowired
	private FinancialTargetService ftService;

	/**
	 * SAVE FinancialTarget DATA HERE ADD NEW RESOURCE FinancialTarget
	 * 
	 * @return
	 */

	@PostMapping("/saveFinancialTarget")
	public FinancialTarget addFinancialTarget(@RequestBody FinancialTarget ft) {
		return ftService.addFinancialTarget(ft);

	}

	/**
	 * GET ALL FinancialTarget DATA HERE GET ALL DATA IN LIST FinancialTarget
	 * 
	 * @return
	 */
	@GetMapping("/getAllFinancialTarget")
	public List<FinancialTarget> getAllFinancialTarget() {
		return ftService.getAllFinancialTarget();

	}

	/**
	 * GET FinancialTarget DATA HERE USING ID FinancialTarget DATA FETCH USING ID
	 * 
	 * @return
	 */
	@GetMapping("/getftById/{ftid}")
	public FinancialTarget getFinancialTargetById(@PathVariable("ftid") int ftid) {
		return ftService.getFinancialTargetById(ftid);

	}

	/**
	 * DELETE FinancialTarget DATA HERE DELETE FinancialTarget USING ID
	 * 
	 * @return
	 */
	@DeleteMapping("/deleteft/{ftid}")
	public String deleteFinancialTarget(@PathVariable("ftid") int ftid) {
		ftService.deleteFinancialTarget(ftid);
		return "FINANCIAL TARGET ID " + ftid + " DELETED SUCCESSFULLY ";
	}

	/**
	 * UPDATE FinancialTarget DATA HERE USIING UID UPDATE FinancialTarget USING ID
	 * 
	 * @return
	 */
	@PutMapping("/updateft/{ftid}")
	public FinancialTarget updateFinancialTarget(@RequestBody FinancialTarget ft, @PathVariable("ftid") int ftid) {
		return ftService.updateFinancialTarget(ft, ftid);

	}

	/*
	 * GET DATA HERE USING DATE
	 */

	@GetMapping("/getfindDate/{startDate}/{endDate}")
	public ResponseEntity<List<FinancialTarget>> findDate(
			@PathVariable("startDate") @DateTimeFormat(pattern = "yyyy-MM-dd") Date startDate,
			@PathVariable("endDate") @DateTimeFormat(pattern = "yyyy-MM-dd") Date endDate) {
		try {
			List<FinancialTarget> FinancialTarget = ftService.findFinancialTargetDate(startDate, endDate);
			return ResponseEntity.ok(FinancialTarget);
		} catch (Exception e) {
			e.printStackTrace(); // Log the exception
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}

}
