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

import com.gre.crudoperation.Entity.LockingStatus;
import com.gre.crudoperation.service.LockingStatusService;

@RestController
@RequestMapping("/api")
public class LockingStatusController {

	@Autowired
	private LockingStatusService lockingService;

	/**
	 * SAVE NEW DATA ADD NEW RESOURSCE
	 * 
	 * @param locking
	 * @return
	 */
	@PostMapping("/addLockingStatus")
	public LockingStatus addLockingStatus(@RequestBody LockingStatus locking) {
		return lockingService.addLockingStatus(locking);
	}

	/**
	 * GET ALL DATA LIST GET ALL DATA HERE
	 * 
	 * @param locking
	 * @return
	 */
	@GetMapping("/getLockingStatus")
	public List<LockingStatus> getAllLockingStatus() {
		return lockingService.getAllLockingStatus();
	}

	/**
	 * GET DATA USING ID GET DATA
	 * 
	 * @param locking
	 * @return
	 */
	@GetMapping("/getLockingStatusById/{id}")
	public LockingStatus getLockingStatusById(@PathVariable("id") int id) {
		return lockingService.getLockingStatusById(id);
	}

	/**
	 * DELETE DATA USING ID DELETE
	 * 
	 * @param locking
	 * @return
	 */

	@DeleteMapping("/deleteLockingStatus/{id}")
	public String deleteLockingStatus(@PathVariable("id") int id) {
		lockingService.deleteLockingStatus(id);

		return "Locking Status Data Id " + id + " Deleted Successfully  ";
	}

	/**
	 * UPDATE DATA USING ID UPDATE EXIST DATA
	 * 
	 * @param locking
	 * @return
	 */

	@PutMapping("/updateLockingStatus/{id}")
	public LockingStatus updateLockingStatus(@RequestBody LockingStatus locking, @PathVariable("id") int id) {
		return lockingService.updateLockingStatus(locking, id);
	}

}
