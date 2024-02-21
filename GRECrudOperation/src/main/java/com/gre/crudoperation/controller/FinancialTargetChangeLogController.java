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

import com.gre.crudoperation.Entity.FinancialTargetChangeLog;
import com.gre.crudoperation.service.FinancialTargetChangeLogService;

@RestController
@RequestMapping("/api")
public class FinancialTargetChangeLogController {

	@Autowired
	private FinancialTargetChangeLogService ftclService;
	
	
	/*
	 * ADD NEW DATA HERE 
	 * STORE NEW REQUEST DATA 
	 */
	@PostMapping("addftcl")
	public FinancialTargetChangeLog addFinancialTargetChangeLog(@RequestBody FinancialTargetChangeLog ftcl) {
		return ftclService.addFinancialTargetChangeLog(ftcl);
	}
	
	
	/*
	 * GET ALL DATA HERE 
	 * GET ALL DATA LIST 
	 */
	@GetMapping("/getAllftcl")
	public List<FinancialTargetChangeLog> getAllFinancialTargetChangeLog() {
		return ftclService.getAllFinancialTargetChangeLog();
	}
	
	
	/*
	 * GET DATA HERE USING ID 
	 * GET REQUEST ID DATA 
	 */
     @GetMapping("/getftclById/{ftclogid}")
	public FinancialTargetChangeLog getFinancialTargetChangeLogById(@PathVariable("ftclogid") int ftclogid) {
		
		return ftclService.getFinancialTargetChangeLogById(ftclogid);
	}
	
	
	
	/*
	 * DELETE DATA HERE  USING ID
	 * DELETE REQUEST DATA 
	 */
	
	@DeleteMapping("/deleteftcl/{ftclogid}")
	public String deleteFinancialTargetChangeLog(@PathVariable("ftclogid") int ftclogid) {
		ftclService.deleteFinancialTargetChangeLog(ftclogid);
		return "data id "+ ftclogid +" deleted successfully";
	}
	
	
	
	
	/*
	 * update DATA HERE 
	 * UPDATE REQUEST DATA 
	 */
	@PutMapping("/updateftcl/{ftclogid}")
	public FinancialTargetChangeLog updateFinancialTargetChangeLog(@RequestBody FinancialTargetChangeLog ftcl, @PathVariable("ftclogid")int ftclogid) {
		return ftclService.updateFinancialTargetChangeLog(ftcl, ftclogid);
	}
	
	
	
}
