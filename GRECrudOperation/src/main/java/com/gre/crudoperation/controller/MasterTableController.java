package com.gre.crudoperation.controller;

import java.util.List;

import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gre.crudoperation.Entity.MasterTable;
import com.gre.crudoperation.UserRepository.MasterTableRepository;
import com.gre.crudoperation.service.MasterTableService;

@RequestMapping("/api")
@RestController
public class MasterTableController {

	@Autowired
	private MasterTableRepository master;

	@Autowired
	private MasterTableService masterService;

	/**
	 * ADD NEW Master DATA HERE
	 */

	@PostMapping("/addMasterData")
	public MasterTable addMasterData(@RequestBody MasterTable masterData) {
		System.out.println(masterData);

		return masterService.addMasterData(masterData);
	}

	/**
	 * GET ALL MASTER DATA HERE
	 */

	@GetMapping("/getAllMasterData")
	public List<MasterTable> getMasterData() {

		return masterService.getMasterAllData();
	}

	/**
	 * GET MASTER DATA HERE USING BY ID
	 */
	@GetMapping("/getMasterData/{master_id}")
	public MasterTable getMasterDataByID(@PathVariable("master_id") int master_id) {

		return masterService.getMasterDataById(master_id);
	}

	/**
	 * Delete MASTER DATA HERE USING BY ID
	 */
	@DeleteMapping("/deleteMasterData/{master_id}")
	public String deleteMasterData(@PathVariable("master_id") int master_id) {

		masterService.deleteMasterData(master_id);

		return "master Date Deleted Successfully";
	}

	/**
	 * UPDATE MASTER DATA HERE USING BY ID
	 */

	@PutMapping("/updateMasterData/{master_id}")
	public MasterTable updateMasterData(@PathVariable("master_id") int master_id, @RequestBody MasterTable master) {
		return masterService.updateMasterAllData(master, master_id);
	}

}
