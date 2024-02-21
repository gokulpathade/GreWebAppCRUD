package com.gre.crudoperation.Entity;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table
public class Project {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int project_id;
	private String project_name;
	private Timestamp date_of_request;
	private String project_description;
	private int project_value;

	private Date created_date;
	private String createdby;
	private Date revised_closerdate;
	private Date date_of_approval;
	
	
	
	
	
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "project")
	private List<FinancialChangeLog> financialChangeLogs;
	
	
	//


//	

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "project")
	private List<FinancialYear> finYear;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "project")
	private List<ProjectValueApproval> projectValueApproval;
	
	

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "project")
	private List<ProjectChangeLog> projectChangeLog;
	
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "project")
	private List<Notification> notify;
	
	
	
	
	/**
	 * 
	 */
	public Project() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
	
	
	
	
	
	/**
	 * @param project_id
	 * @param project_name
	 * @param date_of_request
	 * @param project_description
	 * @param project_value
	 * @param created_date
	 * @param createdby
	 * @param revised_closerdate
	 * @param date_of_approval
	 */
	public Project(int project_id, String project_name, Timestamp date_of_request, String project_description,
			int project_value, Date created_date, String createdby, Date revised_closerdate, Date date_of_approval) {
		this.project_id = project_id;
		this.project_name = project_name;
		this.date_of_request = date_of_request;
		this.project_description = project_description;
		this.project_value = project_value;
		this.created_date = created_date;
		this.createdby = createdby;
		this.revised_closerdate = revised_closerdate;
		this.date_of_approval = date_of_approval;
	}











	/**
	 * @return the project_id
	 */
	public int getProject_id() {
		return project_id;
	}
	/**
	 * @param project_id the project_id to set
	 */
	public void setProject_id(int project_id) {
		this.project_id = project_id;
	}
	/**
	 * @return the project_name
	 */
	public String getProject_name() {
		return project_name;
	}
	/**
	 * @param project_name the project_name to set
	 */
	public void setProject_name(String project_name) {
		this.project_name = project_name;
	}
	/**
	 * @return the date_of_request
	 */
	public Timestamp getDate_of_request() {
		return date_of_request;
	}
	/**
	 * @param date_of_request the date_of_request to set
	 */
	public void setDate_of_request(Timestamp date_of_request) {
		this.date_of_request = date_of_request;
	}
	/**
	 * @return the project_description
	 */
	public String getProject_description() {
		return project_description;
	}
	/**
	 * @param project_description the project_description to set
	 */
	public void setProject_description(String project_description) {
		this.project_description = project_description;
	}
	/**
	 * @return the project_value
	 */
	public int getProject_value() {
		return project_value;
	}
	/**
	 * @param project_value the project_value to set
	 */
	public void setProject_value(int project_value) {
		this.project_value = project_value;
	}
	/**
	 * @return the created_date
	 */
	public Date getCreated_date() {
		return created_date;
	}
	/**
	 * @param created_date the created_date to set
	 */
	public void setCreated_date(Date created_date) {
		this.created_date = created_date;
	}
	/**
	 * @return the createdby
	 */
	public String getCreatedby() {
		return createdby;
	}
	/**
	 * @param createdby the createdby to set
	 */
	public void setCreatedby(String createdby) {
		this.createdby = createdby;
	}
	/**
	 * @return the revised_closerdate
	 */
	public Date getRevised_closerdate() {
		return revised_closerdate;
	}
	/**
	 * @param revised_closerdate the revised_closerdate to set
	 */
	public void setRevised_closerdate(Date revised_closerdate) {
		this.revised_closerdate = revised_closerdate;
	}
	/**
	 * @return the date_of_approval
	 */
	public Date getDate_of_approval() {
		return date_of_approval;
	}
	/**
	 * @param date_of_approval the date_of_approval to set
	 */
	public void setDate_of_approval(Date date_of_approval) {
		this.date_of_approval = date_of_approval;
	}











	@Override
	public String toString() {
		return "Project [project_id=" + project_id + ", project_name=" + project_name + ", date_of_request="
				+ date_of_request + ", project_description=" + project_description + ", project_value=" + project_value
				+ ", created_date=" + created_date + ", createdby=" + createdby + ", revised_closerdate="
				+ revised_closerdate + ", date_of_approval=" + date_of_approval + "]";
	}

	


	
	
}
