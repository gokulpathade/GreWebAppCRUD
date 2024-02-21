package com.gre.crudoperation.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gre.crudoperation.Entity.Project;
import com.gre.crudoperation.UserRepository.ProjectRepository;

@Service
public class ProjectService {

	
	@Autowired
	private ProjectRepository projectRepo;
	
	
	
	/** SAVE DATA 
	 *  ADD NEW DATA IN THE PROJECT
	 * @param project
	 * @return
	 */
	
	public Project addProject(Project project) {
		return projectRepo.save(project);
		
	}
	
	
	
	
	/** GET ALL PROJECT DATA 
	 *  GET DATA IN LIST 
	 * @param project
	 * @return
	 */
	
	public List<Project> getALLProject() {
		return projectRepo.findAll();
		
	}
	
	
	
	
	
	
	
	/** GET DATA USING ID 
	 *  GET DATA USING PROJECT ID
	 * @param project_ID
	 * @return
	 */
	
	public Project getProjectById(int project_id) {
		return projectRepo.findById(project_id).get();
		
	}
	
	
	
	
	
	
	/** DELETE DATA 
	 *  DELETE DATA USING ID
	 * @param project_id
	 * @return
	 */
	
	public void deleteProject(int project_id) {
	       projectRepo.deleteById(project_id);
		
	}
	
	
	
	
	
	
	
	/** UPDATE EXISTING  DATA USING ID
	 *  UPDATE DATA USING DATA ID
	 * @param project_id
	 * @return
	 */
	
	public Project updateProject(Project project, int project_id) {
		
		Optional<Project> target = projectRepo.findById(project_id);
		if(target.isPresent())
		{
			Project alreadyExist = target.get();
			alreadyExist.setCreated_date(project.getCreated_date());
			alreadyExist.setCreatedby(project.getCreatedby());
			alreadyExist.setDate_of_approval(project.getDate_of_approval());
			alreadyExist.setDate_of_request(project.getDate_of_request());
			alreadyExist.setProject_description(project.getProject_description());
			alreadyExist.setProject_name(project.getProject_name());
			alreadyExist.setProject_value(project.getProject_value());
			alreadyExist.setRevised_closerdate(project.getRevised_closerdate());
			
			return projectRepo.save(alreadyExist);
		}
		else {
	throw new IllegalArgumentException("project data id "+ project_id +" Not Found ");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
