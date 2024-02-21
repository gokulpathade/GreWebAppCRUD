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

import com.gre.crudoperation.Entity.FinancialYear;
import com.gre.crudoperation.service.FinancialYearService;

@RequestMapping("/api")
@RestController
public class FinancialYearController {

	@Autowired
	private FinancialYearService financialService;

	/*
	 * SAVE NEW DATA HERE ADD NEW DATA
	 */
	@PostMapping("/addFinancialYear")
	public FinancialYear addFinancialYearData(@RequestBody FinancialYear financialyear) {
		return financialService.addFinancialYearData(financialyear);

	}

	/*
	 * GET ALL DATA HERE FETCH ALL DATA
	 */
	@GetMapping("/getFinancialYear")
	public List<FinancialYear> getFinancialYearData() {
		return financialService.getFinancialYearData();

	}

	/*
	 * FETCH DATA HERE USING ID GET DATA USING ID
	 */
	@GetMapping("/getFinancialYearById/{financial_id}")
	public FinancialYear getFinancialYearById(@PathVariable("financial_id") int financial_id) {
		return financialService.getFinancialYearById(financial_id);

	}

	/*
	 * DELETE DATA HERE USING ID DELETE DATA HERE USING FinancialYear ID
	 */
	@DeleteMapping("/deleteFinancialYear/{financial_id}")
	public String deleteFinancialYearData(@PathVariable("financial_id") int financial_id) {
		financialService.deleteFinancialYearData(financial_id);
		return "FinancialYear data id " + financial_id + " deleted successfully  ";
	}

	/*
	 * UPDATE DATA HERE USING ID UPDATE DATA USING FinancialYear ID
	 */
	@PutMapping("/updatefy/{financial_id}")
	public FinancialYear updateFinancialYearData(@RequestBody FinancialYear financialyear,
			@PathVariable("financial_id") int financial_id) {

		return financialService.updateFinancialYearData(financialyear, financial_id);

	}

}
