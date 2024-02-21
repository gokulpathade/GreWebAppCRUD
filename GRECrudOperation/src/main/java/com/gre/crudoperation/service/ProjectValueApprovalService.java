package com.gre.crudoperation.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gre.crudoperation.Entity.ProjectValueApproval;
import com.gre.crudoperation.UserRepository.ProjectValueApprovalRepository;

@Service
public class ProjectValueApprovalService {

	@Autowired
	private ProjectValueApprovalRepository projectRepo;
	
	
	/*
	 * ADD/SAVE NEW ProjectValueApproval VALUE IS HERE
	 */
	
	public ProjectValueApproval addProjectValueApproval(ProjectValueApproval project) {
		return projectRepo.save(project);
		
	}
	
	
	/*
	 * GET ProjectValueApproval DATA IS HERE
	 */
	
	public List<ProjectValueApproval> getProjectValueApproval() {
		return projectRepo.findAll();
		
	}
	
	

	public List<ProjectValueApproval> getProjectValueApprovalDTO() {
		return projectRepo.findAll();
		
	}
	
	
	/*
	 * GET ProjectValueApproval DATA IS HERE USING BY ID HERE 
	 */
	
	public ProjectValueApproval getProjectValueApprovalById( int pid ) {
		return projectRepo.findById(pid).get();
		
	}
	

	public ProjectValueApproval getProjectValueApprovalByIdDTO( int pid ) {
		return projectRepo.findById(pid).get();
		
	}
	
	
	/*
	 * Delete ProjectValueApproval DATA IS HERE USING BY ID HERE 
	 */
	
	public void deleteProjectValueApproval(int pid ) {
		 projectRepo.deleteById(pid);
		
	}
	
	
	
	
	
	

	/*
	 * UPDATE ProjectValueApproval DATA IS HERE USING BY ID HERE 
	 */
	

    public ProjectValueApproval updateProjectValueApprovalById(ProjectValueApproval project, int pid) {

        Optional<ProjectValueApproval> projectValueOptional = projectRepo.findById(pid);

        if (projectValueOptional.isPresent()) {
            ProjectValueApproval existingProject = projectValueOptional.get();

            // Update the fields
            existingProject.setAccount_name(project.getAccount_name());
            existingProject.setAfter_change(project.getAfter_change());
            existingProject.setBefore_change(project.getBefore_change());
            existingProject.setDate_of_approval(project.getDate_of_approval());
            existingProject.setDate_of_request(project.getDate_of_request());
            existingProject.setFlag(project.getFlag());
//            existingProject.setProject_id(project.getProject_id());
            existingProject.setSales_stage(project.getSales_stage());
            existingProject.setUg_id(project.getUg_id());

            existingProject.setUser_name(project.getUser_name());

            // Save the updated entity
            return projectRepo.save(existingProject);
        } else {
            // If the target with the specified ID is not found, throw an exception
            throw new IllegalArgumentException("ProjectValueApproval with ID " + pid + " not found");
        }
		
	}
	
	
	
	
	
	
}
