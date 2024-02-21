package com.gre.crudoperation.Entity;

import java.sql.Date;
import java.sql.Timestamp;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table
public class ProjectValueApproval {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
 private int pid;
 private String account_name;
   
 private String after_change;
 
 private String before_change;  
 private Date date_of_approval;
 
 private Timestamp  date_of_request; 
 private String flag; 
// private int project_id;
 
 private String ug_id;  

 
 private String user_name; 
 private String sales_stage;
 
 
 

@ManyToOne(cascade = CascadeType.ALL)
 @JoinColumn(name = "project_id") 
 // name should match the actual column name in your database
 private Project project;

  
@ManyToOne(cascade = CascadeType.ALL)
@JoinColumn(name = "userid")
// name should match the actual column name in your database
private User user;


/**
 * 
 */
public ProjectValueApproval() {
	super();
	// TODO Auto-generated constructor stub
}


/**
 * @param pid
 * @param account_name
 * @param after_change
 * @param before_change
 * @param date_of_approval
 * @param date_of_request
 * @param flag
 * @param ug_id
 * @param user_name
 * @param sales_stage
 */
public ProjectValueApproval(int pid, String account_name, String after_change, String before_change,
		Date date_of_approval, Timestamp date_of_request, String flag, String ug_id, String user_name,
		String sales_stage) {
	super();
	this.pid = pid;
	this.account_name = account_name;
	this.after_change = after_change;
	this.before_change = before_change;
	this.date_of_approval = date_of_approval;
	this.date_of_request = date_of_request;
	this.flag = flag;
	this.ug_id = ug_id;
	this.user_name = user_name;
	this.sales_stage = sales_stage;
}


/**
 * @return the pid
 */
public int getPid() {
	return pid;
}


/**
 * @param pid the pid to set
 */
public void setPid(int pid) {
	this.pid = pid;
}


/**
 * @return the account_name
 */
public String getAccount_name() {
	return account_name;
}


/**
 * @param account_name the account_name to set
 */
public void setAccount_name(String account_name) {
	this.account_name = account_name;
}


/**
 * @return the after_change
 */
public String getAfter_change() {
	return after_change;
}


/**
 * @param after_change the after_change to set
 */
public void setAfter_change(String after_change) {
	this.after_change = after_change;
}


/**
 * @return the before_change
 */
public String getBefore_change() {
	return before_change;
}


/**
 * @param before_change the before_change to set
 */
public void setBefore_change(String before_change) {
	this.before_change = before_change;
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
 * @return the flag
 */
public String getFlag() {
	return flag;
}


/**
 * @param flag the flag to set
 */
public void setFlag(String flag) {
	this.flag = flag;
}


/**
 * @return the ug_id
 */
public String getUg_id() {
	return ug_id;
}


/**
 * @param ug_id the ug_id to set
 */
public void setUg_id(String ug_id) {
	this.ug_id = ug_id;
}


/**
 * @return the user_name
 */
public String getUser_name() {
	return user_name;
}


/**
 * @param user_name the user_name to set
 */
public void setUser_name(String user_name) {
	this.user_name = user_name;
}


/**
 * @return the sales_stage
 */
public String getSales_stage() {
	return sales_stage;
}


/**
 * @param sales_stage the sales_stage to set
 */
public void setSales_stage(String sales_stage) {
	this.sales_stage = sales_stage;
}


/**
 * @return the project
 */
public Project getProject() {
	return project;
}


/**
 * @param project the project to set
 */
public void setProject(Project project) {
	this.project = project;
}


/**
 * @return the user
 */
public User getUser() {
	return user;
}


/**
 * @param user the user to set
 */
public void setUser(User user) {
	this.user = user;
}


@Override
public String toString() {
	return "ProjectValueApproval [pid=" + pid + ", account_name=" + account_name + ", after_change=" + after_change
			+ ", before_change=" + before_change + ", date_of_approval=" + date_of_approval + ", date_of_request="
			+ date_of_request + ", flag=" + flag + ", ug_id=" + ug_id + ", user_name=" + user_name + ", sales_stage="
			+ sales_stage + ", project=" + project + ", user=" + user + "]";
}
 
	




















	
}
