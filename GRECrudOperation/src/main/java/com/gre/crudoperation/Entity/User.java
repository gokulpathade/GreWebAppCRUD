package com.gre.crudoperation.Entity;

import java.util.List;

import jakarta.persistence.CascadeType;

//import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * This is User Modal class
 */

@Entity
@Table


public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userid;
	
	  @NotNull(message = "Full name is required")
	    private String fullname;

	    @NotNull(message = "Please enter password")
	    private String password;

	    private String userrole;

	    @NotNull(message = "Please enter username")
	    private String username;


        
        
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
//	@JoinColumn(name = "notification_id")
	private List<Notification> notifications;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
//	@JoinColumn(name = "ftclogid")
	private List<FinancialTargetChangeLog> financialtargetchangelog;

	@OneToMany( fetch = FetchType.LAZY, mappedBy = "user")
	private List<FinancialTarget> financialtarget;

	@OneToMany( fetch = FetchType.LAZY, mappedBy = "user")
	private List<ProjectChangeLog> projectchangelog;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
	private List<FinancialChangeLog> FinancialChangeLog;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
	private List<FinancialTarget1> fTarget1;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
	private List<FinancialTarget2> fTarget2;
	
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
	private List<ProjectValueApproval> pvApproval;
	
	
	
	
	
	

	/**
	 * @return the notifications
	 */
	public List<Notification> getNotifications() {
		return notifications;
	}

	/**
	 * @param notifications the notifications to set
	 */
	public void setNotifications(List<Notification> notifications) {
		this.notifications = notifications;
	}

	/**
	 * @return the financialtargetchangelog
	 */
	public List<FinancialTargetChangeLog> getFinancialtargetchangelog() {
		return financialtargetchangelog;
	}

	/**
	 * @param financialtargetchangelog the financialtargetchangelog to set
	 */
	public void setFinancialtargetchangelog(List<FinancialTargetChangeLog> financialtargetchangelog) {
		this.financialtargetchangelog = financialtargetchangelog;
	}

	/**
	 * @return the financialtarget
	 */
	public List<FinancialTarget> getFinancialtarget() {
		return financialtarget;
	}

	/**
	 * @param financialtarget the financialtarget to set
	 */
	public void setFinancialtarget(List<FinancialTarget> financialtarget) {
		this.financialtarget = financialtarget;
	}

	/**
	 * @return the projectchangelog
	 */
	public List<ProjectChangeLog> getProjectchangelog() {
		return projectchangelog;
	}

	/**
	 * @param projectchangelog the projectchangelog to set
	 */
	public void setProjectchangelog(List<ProjectChangeLog> projectchangelog) {
		this.projectchangelog = projectchangelog;
	}

	/**
	 * @return the financialChangeLog
	 */
	public List<FinancialChangeLog> getFinancialChangeLog() {
		return FinancialChangeLog;
	}

	/**
	 * @param financialChangeLog the financialChangeLog to set
	 */
	public void setFinancialChangeLog(List<FinancialChangeLog> financialChangeLog) {
		FinancialChangeLog = financialChangeLog;
	}

	/**
	 * 
	 */
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param userid
	 * @param fullname
	 * @param password
	 * @param userrole
	 * @param username
	 */
	public User(int userid, String fullname, String password, String userrole, String username) {
		super();
		this.userid = userid;
		this.fullname = fullname;
		this.password = password;
		this.userrole = userrole;
		this.username = username;
	}

	@Override
	public String toString() {
		return "User [userid=" + userid + ", fullname=" + fullname + ", password=" + password + ", userrole=" + userrole
				+ ", username=" + username + "]";
	}

	/**
	 * @return the userid
	 */
	public int getUserid() {
		return userid;
	}

	/**
	 * @param userid the userid to set
	 */
	public void setUserid(int userid) {
		this.userid = userid;
	}

	/**
	 * @return the fullname
	 */
	public String getFullname() {
		return fullname;
	}

	/**
	 * @param fullname the fullname to set
	 */
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the userrole
	 */
	public String getUserrole() {
		return userrole;
	}

	/**
	 * @param userrole the userrole to set
	 */
	public void setUserrole(String userrole) {
		this.userrole = userrole;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

//   @OneToMany(mappedBy = "Notification", cascade = CascadeType.ALL)
//	private List<Notification> notification;
//	

}
