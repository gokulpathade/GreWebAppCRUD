package com.gre.crudoperation.controller;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.modelmapper.spi.MatchingStrategy;
import org.springframework.beans.factory.annotation.Autowired;
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

import com.gre.crudoperation.DTO.ProjectValueApprovalDTO;
import com.gre.crudoperation.Entity.ProjectValueApproval;
import com.gre.crudoperation.service.ProjectValueApprovalService;

@RestController
@RequestMapping("/api")
public class ProjectValueApprovalcontroller {

	@Autowired
	private ModelMapper modelMapper;

	@Autowired
	private ProjectValueApprovalService projectService;

	/**
	 * Adds a project value approval.
	 */
	@PostMapping("/addproject")
	public ResponseEntity<ProjectValueApproval> addProjectValueApproval(@RequestBody ProjectValueApproval project) {
		try {
			ProjectValueApproval addedProject = projectService.addProjectValueApproval(project);
			return ResponseEntity.ok(addedProject);
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}

	/**
	 * Retrieves all project value approvals.
	 */
	@GetMapping("/getAllDataproject")
	public ResponseEntity<List<ProjectValueApproval>> getProjectValueApproval() {
		try {
			List<ProjectValueApproval> projectValueApprovals = projectService.getProjectValueApproval();
			return ResponseEntity.ok(projectValueApprovals);
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}

	/*
	 * GET ALL DATA HERE FETCH ALL DATA
	 * 
	 * Retrieves a list of ProjectValueApprovalDTO objects.
	 *
	 * @return a list of ProjectValueApprovalDTO objects
	 */
	@GetMapping("/getAllDataDTO")
	public List<ProjectValueApprovalDTO> getProjectValueApprovalDTO() {
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);

		return projectService.getProjectValueApproval().stream()
				.map(ProjectValueApproval -> modelMapper.map(ProjectValueApproval, ProjectValueApprovalDTO.class))
				.collect(Collectors.toList());

	}

//	/*
//	 * GET ProjectValueApproval DATA HERE using BY ID FETCH DATA USING ID
//	 * 
//	 */
	@GetMapping("/getDataByIdproject/{pid}")
	public ProjectValueApproval getProjectValueApprovalById(@PathVariable("pid") int pid) {
		return projectService.getProjectValueApprovalById(pid);
	}

	/*
	 * GET ProjectValueApproval DATA HERE using BY ID FETCH DATA USING ID
	 * 
	 */
	@GetMapping("/getdataDto/{pid}")
	public ResponseEntity<ProjectValueApprovalDTO> getProjectValueApprovalByIdDTO(@PathVariable("pid") int pid) {
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);

		ProjectValueApproval projectVA = projectService.getProjectValueApprovalById(pid);
		// convert entity to DTO
		ProjectValueApprovalDTO projectRes = modelMapper.map(projectVA, ProjectValueApprovalDTO.class);

		return ResponseEntity.ok().body(projectRes);

	}

	/*
	 * DELETE ProjectValueApproval DATA HERE using BY ID DELETE DATA USING ID
	 * 
	 */
	@DeleteMapping("/deleteproject/{pid}")
	public String deleteProjectValueApproval(@PathVariable("pid") int pid) {
		projectService.deleteProjectValueApproval(pid);
		return " ProjectValueApproval Data id " + pid + " Deleted  ";

	}

	/*
	 * GET ProjectValueApproval DATA HERE using BY ID UPDATE DATA USING ID
	 */
	@PutMapping("/updateproject/{pid}")
	public ProjectValueApproval updateProjectValueApprovalById(@RequestBody ProjectValueApproval project,
			@PathVariable("pid") int pid) {
		return projectService.updateProjectValueApprovalById(project, pid);

	}

}
