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

import com.gre.crudoperation.Entity.ProjectChangeLog;
import com.gre.crudoperation.service.ProjectChangeLogService;

@RestController
@RequestMapping("/api")
public class ProjectChangeLogController {

	@Autowired
	private ProjectChangeLogService pclService;

	/*
	 * ADD NEW DATA HERE
	 * 
	 */
	@PostMapping("/addProjectChangeLog")
	public ProjectChangeLog addProjectChangeLog(@RequestBody ProjectChangeLog pcl) {

		return pclService.addProjectChangeLog(pcl);
	}

	/*
	 * GET ALL DATA HERE FETCH ALL DATA LIST
	 */
	@GetMapping("/getProjectChangeLog")
	public List<ProjectChangeLog> getAllProjectChangeLog() {

		return pclService.getAllProjectChangeLog();
	}

	/*
	 * GET DATA HERE USING ID FETCH DATA HERE ,USING ID
	 */
	@GetMapping("/getProjectChangeLogById/{pclid}")
	public ProjectChangeLog getProjectChangeLogById(@PathVariable("pclid") int pclid) {

		return pclService.getProjectChangeLogById(pclid);

	}

	/*
	 * DELETE DATA HERE USING ID
	 * 
	 */
	@DeleteMapping("/deleteProjectChangeLog/{pclid}")
	public String deleteProjectChangeLog(@PathVariable("pclid") int pclid) {

		pclService.deleteProjectChangeLog(pclid);
		return "ProjectChangeLog data id " + pclid + " Deleted Successfully";

	}

	/*
	 * UPDATE DATA HERE EXIST ALL DATA UPDATE
	 */
	@PutMapping("/updateProjectChangeLog/{pclid}")
	public ProjectChangeLog updateProjectChangeLog(@RequestBody ProjectChangeLog pcl,
			@PathVariable("pclid") int pclid) {

		return pclService.updateProjectChangeLog(pcl, pclid);
	}

}
