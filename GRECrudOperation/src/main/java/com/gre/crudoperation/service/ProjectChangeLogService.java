package com.gre.crudoperation.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gre.crudoperation.Entity.Project;
import com.gre.crudoperation.Entity.ProjectChangeLog;
import com.gre.crudoperation.UserRepository.ProjectChangeLogRepository;

@Service
public class ProjectChangeLogService {

	@Autowired
	private ProjectChangeLogRepository pclRepo;
	
	
	/*
	 * ADD NEW DATA HERE 
	 * 
	 */
	public ProjectChangeLog addProjectChangeLog(ProjectChangeLog pcl) {
		
		return pclRepo.save(pcl);
	}
	
	
	
	
	
	/*
	 * GET ALL DATA HERE 
	 * FETCH ALL DATA LIST
	 */
	public List<ProjectChangeLog> getAllProjectChangeLog() {
		
		return pclRepo.findAll();
	}
	
	
	
	
	/*
	 * GET DATA HERE USING ID 
	 * FETCH DATA HERE ,USING  ID 
	 */
	
	public ProjectChangeLog getProjectChangeLogById(int pclid) {
		
		return pclRepo.findById(pclid).get();
		
	}
	
	
	
	/*
	 * DELETE DATA HERE 
	 * 
	 */
	public void deleteProjectChangeLog(int pclid) {
		
		pclRepo.deleteById(pclid);
	}
	
	
	/*
	 * UPDATE DATA HERE 
	 * 
	 */
	public ProjectChangeLog updateProjectChangeLog(ProjectChangeLog pcl, int pclid) {
		Optional<ProjectChangeLog> target = pclRepo.findById(pclid);
		
		if(target.isPresent()) {
			ProjectChangeLog alreadyExist = target.get();
			alreadyExist.setAccount_name(pcl.getAccount_name());
			alreadyExist.setClosure_date(pcl.getClosure_date());
			alreadyExist.setLog_date(pcl.getLog_date());
			alreadyExist.setOpp_date(pcl.getOpp_date());
			alreadyExist.setPercentage_probability(pcl.getPercentage_probability());
			alreadyExist.setProject_description(pcl.getProject_description());
			alreadyExist.setProject_value(pcl.getProject_value());
			alreadyExist.setRemark(pcl.getRemark());

			alreadyExist.setRevised_closerdate(pcl.getRevised_closerdate());
			alreadyExist.setSales_stage(pcl.getSales_stage());
	        	return pclRepo.save(alreadyExist);
            		}
		else {
			throw new IllegalArgumentException("project data id "+ pclid +" Not Found ");
				}

	}
	
	
	
	
	
	
	
	
	
	
	
//	
//	public Project updateProject(Project project, int project_id) {
//		
//		Optional<Project> target = projectRepo.findById(project_id);
//		if(target.isPresent())
//		{
//			Project alreadyExist = target.get();
//			alreadyExist.setCreated_date(project.getCreated_date());
//			alreadyExist.setCreatedby(project.getCreatedby());
//			alreadyExist.setDate_of_approval(project.getDate_of_approval());
//			alreadyExist.setDate_of_request(project.getDate_of_request());
//			alreadyExist.setProject_description(project.getProject_description());
//			alreadyExist.setProject_name(project.getProject_name());
//			alreadyExist.setProject_value(project.getProject_value());
//			alreadyExist.setRevised_closerdate(project.getRevised_closerdate());
//			
//			return projectRepo.save(alreadyExist);
//		}
//		else {
//	throw new IllegalArgumentException("project data id "+ project_id +" Not Found ");
//		}
//	}
//	
//	
	
	
	
	
	
	
	
}
