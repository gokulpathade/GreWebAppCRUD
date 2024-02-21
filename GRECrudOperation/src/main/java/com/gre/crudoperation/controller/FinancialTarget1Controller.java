package com.gre.crudoperation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gre.crudoperation.Entity.FinancialTarget1;
import com.gre.crudoperation.service.FinancialTarget1Service;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api")
public class FinancialTarget1Controller {

	@Autowired
	private FinancialTarget1Service ft1Service;

	/**
	 * ADD NEW FINANCIAL TARGET
	 * 
	 * @param ft1
	 * @return
	 */
	@PostMapping("/addFanancialTarget")
	public FinancialTarget1 addFinancialTarget1(@RequestBody FinancialTarget1 ft1) {
		return ft1Service.addFinancialTarget1(ft1);
	}

	/**
	 * GET ALL FinancialTarget DATA HERE
	 * 
	 * @param ft1
	 * @return
	 */
	@GetMapping("/getAllFt1Data")
	public List<FinancialTarget1> getFinancialTarget1(FinancialTarget1 ft1) {
		return ft1Service.getFinancialTarget1(ft1);
	}

	/**
	 * GET FinancialTarget DATA HERE using by id targetid1
	 * 
	 * @param ft1
	 * @return
	 */
	@GetMapping("/getFinancialTargetById/{targetid1}")
	public FinancialTarget1 getFinancialTargetById(@PathVariable("targetid1") Long targetid1) {
		return ft1Service.getFinancialTargetById(targetid1);

	}

	/**
	 * Update FinancialTarget DATA HERE using by id targetid1
	 * 
	 * @param ft1
	 * @return
	 */
	@PutMapping("/updateFinancialTarget/{targetid1}")
	public FinancialTarget1 updateFinancialTarget1(@RequestBody FinancialTarget1 ft1,
			@PathVariable("targetid1") Long targetid1) {
		return ft1Service.updateFinancialTarget(targetid1, ft1);

	}

	/**
	 * DELET FinancialTarget DATA HERE using by id targetid1
	 * 
	 * @param ft1
	 * @return
	 */
	@DeleteMapping("/deleteFinancialTarget/{targetid1}")
	public String getFinancialTarget1(@PathVariable("targetid1") Long targetid1) {

		ft1Service.deleteFinancialTarget1(targetid1);

		return "FinancialTarget 1 id " + targetid1 + " deleted successfully ";
	}

}
