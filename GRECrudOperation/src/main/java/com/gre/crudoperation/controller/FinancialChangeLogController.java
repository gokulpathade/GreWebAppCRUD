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
import com.gre.crudoperation.Entity.Notification;
import com.gre.crudoperation.service.FinancialChangeLogService;

@RestController
@RequestMapping("/api")
public class FinancialChangeLogController {

	@Autowired
	private FinancialChangeLogService financialService;

	/*
	 * save NEW DATA HERE ADD DATA
	 * 
	 */
	@PostMapping("/savedata")
	public FinancialChangeLog saveData(@RequestBody FinancialChangeLog financial) {
		return financialService.saveData(financial);

	}

	/*
	 * GET ALL DATA HERE FIND ALL DATA
	 * 
	 */
	@GetMapping("/getFinancialChangeLog")
	public List<FinancialChangeLog> getAllData() {
		return financialService.getAllData();

	}

	/*
	 * GET DATA HERE USING BY ID GET DATA USING BY ID
	 * 
	 */
	@GetMapping("/getFinancialChangeLogById/{fclogid}")
	public FinancialChangeLog getDataById(@PathVariable("fclogid") int fclogid) {
		return financialService.getDataById(fclogid);

	}

	/*
	 * DELETE DATA HERE USING BY ID DELETE DATA USING BY ID
	 * 
	 */
	@DeleteMapping("/deleteFinancialChangeLog/{fclogid}")
	public String deleteDataById(@PathVariable("fclogid") int fclogid) {
		financialService.deleteDataById(fclogid);
		return "financialService data id " + fclogid + "deleted successfully";
	}

	/*
	 * UPDATE DATA HERE UPDATA DATA
	 * 
	 */
	@PutMapping("/updateFinancialChangeLog/{fclogid}")
	public FinancialChangeLog updateData(@RequestBody FinancialChangeLog financial,
			@PathVariable("fclogid") int fclogid) {
		return financialService.updateData(financial, fclogid);
	}

	/*
	 * GET DATA HERE USING DATE
	 */

	@GetMapping("/getfclDate/{startDate}/{endDate}")
	public ResponseEntity<List<FinancialChangeLog>> findDate(
			@PathVariable("startDate") @DateTimeFormat(pattern = "yyyy-MM-dd") Date startDate,
			@PathVariable("endDate") @DateTimeFormat(pattern = "yyyy-MM-dd") Date endDate) {
		try {
			List<FinancialChangeLog> FinancialChangeLog = financialService.findDate(startDate, endDate);
			return ResponseEntity.ok(FinancialChangeLog);
		} catch (Exception e) {
			e.printStackTrace(); // Log the exception
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}

}
