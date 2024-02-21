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

import com.gre.crudoperation.Entity.Project;
import com.gre.crudoperation.service.ProjectService;

@RestController
@RequestMapping("/api")
public class ProjectController {

	@Autowired
	private ProjectService projectService;

	/**
	 * SAVE DATA ADD NEW DATA IN THE PROJECT
	 * 
	 * @param project
	 * @return
	 */
	@PostMapping("/addProject")
	public Project addProject(@RequestBody Project project) {
		return projectService.addProject(project);

	}

	/**
	 * GET ALL PROJECT DATA GET DATA IN LIST
	 * 
	 * @param project
	 * @return
	 */

	@GetMapping("/getAllProject")
	public List<Project> getALLProject() {
		return projectService.getALLProject();

	}

	/**
	 * GET DATA USING ID GET DATA USING PROJECT ID
	 * 
	 * @param project_ID
	 * @return
	 */
	@GetMapping("/getProjectDataById/{project_id}")
	public Project getProjectById(@PathVariable("project_id") int project_id) {
		return projectService.getProjectById(project_id);

	}

	/**
	 * DELETE DATA DELETE DATA USING ID
	 * 
	 * @param project_id
	 * @return
	 */
	@DeleteMapping("/deleteProject/{project_id}")
	public String deleteProject(@PathVariable("project_id") int project_id) {
		projectService.deleteProject(project_id);
		return "Project data id " + project_id + " deleted successfully ";
	}

	/**
	 * UPDATE EXISTING DATA USING ID UPDATE DATA USING DATA ID
	 * 
	 * @param project_id
	 * @return
	 */
	@PutMapping("/updateProject/{project_id}")
	public Project updateProject(@RequestBody Project project, @PathVariable("project_id") int project_id) {

		return projectService.updateProject(project, project_id);
	}

}
