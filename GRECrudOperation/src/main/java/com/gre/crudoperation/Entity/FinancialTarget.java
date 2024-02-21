package com.gre.crudoperation.Entity;

import java.sql.Timestamp;
import java.util.Date;

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
public class FinancialTarget {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ftid;
	private Date date;

	private Double q1;
	private Double q2;
	private Double q3;
	private Double q4;
	
	private Double year_target;
	
	   @ManyToOne(cascade = CascadeType.ALL)
	    @JoinColumn(name = "userid") 
	    // name should match the actual column name in your database
	    private User user;

	/**
	 * 
	 */
	public FinancialTarget() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param ftid
	 * @param date
	 * @param q1
	 * @param q2
	 * @param q3
	 * @param q4
	 * @param year_target
	 * @param user
	 */
	public FinancialTarget(int ftid, Date date, Double q1, Double q2, Double q3, Double q4, Double year_target,
			User user) {
		super();
		this.ftid = ftid;
		this.date = date;
		this.q1 = q1;
		this.q2 = q2;
		this.q3 = q3;
		this.q4 = q4;
		this.year_target = year_target;
		this.user = user;
	}

	/**
	 * @return the ftid
	 */
	public int getFtid() {
		return ftid;
	}

	/**
	 * @param ftid the ftid to set
	 */
	public void setFtid(int ftid) {
		this.ftid = ftid;
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
	 * @return the q1
	 */
	public Double getQ1() {
		return q1;
	}

	/**
	 * @param q1 the q1 to set
	 */
	public void setQ1(Double q1) {
		this.q1 = q1;
	}

	/**
	 * @return the q2
	 */
	public Double getQ2() {
		return q2;
	}

	/**
	 * @param q2 the q2 to set
	 */
	public void setQ2(Double q2) {
		this.q2 = q2;
	}

	/**
	 * @return the q3
	 */
	public Double getQ3() {
		return q3;
	}

	/**
	 * @param q3 the q3 to set
	 */
	public void setQ3(Double q3) {
		this.q3 = q3;
	}

	/**
	 * @return the q4
	 */
	public Double getQ4() {
		return q4;
	}

	/**
	 * @param q4 the q4 to set
	 */
	public void setQ4(Double q4) {
		this.q4 = q4;
	}

	/**
	 * @return the year_target
	 */
	public Double getYear_target() {
		return year_target;
	}

	/**
	 * @param year_target the year_target to set
	 */
	public void setYear_target(Double year_target) {
		this.year_target = year_target;
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
		return "FinancialTarget [ftid=" + ftid + ", date=" + date + ", q1=" + q1 + ", q2=" + q2 + ", q3=" + q3 + ", q4="
				+ q4 + ", year_target=" + year_target + ", user=" + user + "]";
	}
	 
	 
}
