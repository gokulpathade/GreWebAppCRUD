package com.gre.crudoperation.Entity;

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
public class FinancialYear {

	
	@Id
	@GeneratedValue
	private int financial_id;
	private Date date;
	private Double offshort;
	private Double on_site;
	private Double total;
	
	
	   @ManyToOne(cascade = CascadeType.ALL)
	    @JoinColumn(name = "userid") 
	    // name should match the actual column name in your database
	    private User user;


	   
	   
	   @ManyToOne(cascade = CascadeType.ALL)
	    @JoinColumn(name = "project_id") 
	    // name should match the actual column name in your database
	    private Project project;

	   
	   
	   
	   
	public Project getProject() {
		return project;
	}


	public void setProject(Project project) {
		this.project = project;
	}


	/**
	 * 
	 */
	public FinancialYear() {
		super();
		// TODO Auto-generated constructor stub
	}


	/**
	 * @param financial_id
	 * @param date
	 * @param offshort
	 * @param on_site
	 * @param total
	 * @param user
	 */
	public FinancialYear(int financial_id, Date date, Double offshort, Double on_site, Double total, User user) {
		super();
		this.financial_id = financial_id;
		this.date = date;
		this.offshort = offshort;
		this.on_site = on_site;
		this.total = total;
		this.user = user;
	}


	/**
	 * @return the financial_id
	 */
	public int getFinancial_id() {
		return financial_id;
	}


	/**
	 * @param financial_id the financial_id to set
	 */
	public void setFinancial_id(int financial_id) {
		this.financial_id = financial_id;
	}


	/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}


	/**
	 * @param date the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}


	/**
	 * @return the offshort
	 */
	public Double getOffshort() {
		return offshort;
	}


	/**
	 * @param offshort the offshort to set
	 */
	public void setOffshort(Double offshort) {
		this.offshort = offshort;
	}


	/**
	 * @return the on_site
	 */
	public Double getOn_site() {
		return on_site;
	}


	/**
	 * @param on_site the on_site to set
	 */
	public void setOn_site(Double on_site) {
		this.on_site = on_site;
	}


	/**
	 * @return the total
	 */
	public Double getTotal() {
		return total;
	}


	/**
	 * @param total the total to set
	 */
	public void setTotal(Double total) {
		this.total = total;
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
		return "FinancialYear [financial_id=" + financial_id + ", date=" + date + ", offshort=" + offshort
				+ ", on_site=" + on_site + ", total=" + total + ", user=" + user + "]";
	}
	 
	
	
}
