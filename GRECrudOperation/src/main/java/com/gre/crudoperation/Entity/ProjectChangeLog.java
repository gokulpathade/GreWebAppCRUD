package com.gre.crudoperation.Entity;

import java.sql.Timestamp;
import java.util.Date;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table

public class ProjectChangeLog {

	@Id
	@GeneratedValue
	private int pclid;
	private String account_name;
	
	private Date closure_date;
	private Timestamp log_date;
	private Date opp_date;

	private String  p_id;
	
	private Double percentage_probability;
    private String project_description;
	private int project_value;
	private String remark;
    private Date revised_closerdate;
    private String sales_stage;
    
    
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "userid") 
    // name should match the actual column name in your database
    private User user;
    
    
    
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "project_id") 
    // name should match the actual column name in your database
    private Project project;
   


	/**
	 * 
	 */
	public ProjectChangeLog() {
		super();
		// TODO Auto-generated constructor stub
	}


	/**
	 * @param pclid
	 * @param account_name
	 * @param closure_date
	 * @param log_date
	 * @param opp_date
	 * @param p_id
	 * @param percentage_probability
	 * @param project_description
	 * @param project_value
	 * @param remark
	 * @param revised_closerdate
	 * @param sales_stage
	 * @param user
	 */
	public ProjectChangeLog(int pclid, String account_name, Date closure_date, Timestamp log_date, Date opp_date,
			String p_id, Double percentage_probability, String project_description, int project_value, String remark,
			Date revised_closerdate, String sales_stage, User user) {
		super();
		this.pclid = pclid;
		this.account_name = account_name;
		this.closure_date = closure_date;
		this.log_date = log_date;
		this.opp_date = opp_date;
		this.p_id = p_id;
		this.percentage_probability = percentage_probability;
		this.project_description = project_description;
		this.project_value = project_value;
		this.remark = remark;
		this.revised_closerdate = revised_closerdate;
		this.sales_stage = sales_stage;
		this.user = user;
	}


	/**
	 * @return the pclid
	 */
	public int getPclid() {
		return pclid;
	}


	/**
	 * @param pclid the pclid to set
	 */
	public void setPclid(int pclid) {
		this.pclid = pclid;
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
	 * @return the closure_date
	 */
	public Date getClosure_date() {
		return closure_date;
	}


	/**
	 * @param closure_date the closure_date to set
	 */
	public void setClosure_date(Date closure_date) {
		this.closure_date = closure_date;
	}


	/**
	 * @return the log_date
	 */
	public Timestamp getLog_date() {
		return log_date;
	}


	/**
	 * @param log_date the log_date to set
	 */
	public void setLog_date(Timestamp log_date) {
		this.log_date = log_date;
	}


	/**
	 * @return the opp_date
	 */
	public Date getOpp_date() {
		return opp_date;
	}


	/**
	 * @param opp_date the opp_date to set
	 */
	public void setOpp_date(Date opp_date) {
		this.opp_date = opp_date;
	}


	/**
	 * @return the p_id
	 */
	public String getP_id() {
		return p_id;
	}


	/**
	 * @param p_id the p_id to set
	 */
	public void setP_id(String p_id) {
		this.p_id = p_id;
	}


	/**
	 * @return the percentage_probability
	 */
	public Double getPercentage_probability() {
		return percentage_probability;
	}


	/**
	 * @param percentage_probability the percentage_probability to set
	 */
	public void setPercentage_probability(Double percentage_probability) {
		this.percentage_probability = percentage_probability;
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
	 * @return the remark
	 */
	public String getRemark() {
		return remark;
	}


	/**
	 * @param remark the remark to set
	 */
	public void setRemark(String remark) {
		this.remark = remark;
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
		return "ProjectChangeLog [pclid=" + pclid + ", account_name=" + account_name + ", closure_date=" + closure_date
				+ ", log_date=" + log_date + ", opp_date=" + opp_date + ", p_id=" + p_id + ", percentage_probability="
				+ percentage_probability + ", project_description=" + project_description + ", project_value="
				+ project_value + ", remark=" + remark + ", revised_closerdate=" + revised_closerdate + ", sales_stage="
				+ sales_stage + ", user=" + user + "]";
	}
 
	
}
