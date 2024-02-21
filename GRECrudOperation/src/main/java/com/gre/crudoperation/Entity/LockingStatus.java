package com.gre.crudoperation.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class LockingStatus {
 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String month;
	private int year;
	private Boolean islocked;
	private String location;

	


	/**
	 * 
	 */
	public LockingStatus() {
		// TODO Auto-generated constructor stub
	}




	/**
	 * @param id
	 * @param month
	 * @param year
	 * @param islocked
	 * @param location
	 */
	public LockingStatus(int id, String month, int year, Boolean islocked, String location) {
		this.id = id;
		this.month = month;
		this.year = year;
		this.islocked = islocked;
		this.location = location;
	}




	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}




	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}




	/**
	 * @return the month
	 */
	public String getMonth() {
		return month;
	}




	/**
	 * @param month the month to set
	 */
	public void setMonth(String month) {
		this.month = month;
	}




	/**
	 * @return the year
	 */
	public int getYear() {
		return year;
	}




	/**
	 * @param year the year to set
	 */
	public void setYear(int year) {
		this.year = year;
	}




	/**
	 * @return the islocked
	 */
	public Boolean getIslocked() {
		return islocked;
	}




	/**
	 * @param islocked the islocked to set
	 */
	public void setIslocked(Boolean islocked) {
		this.islocked = islocked;
	}




	/**
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}




	/**
	 * @param location the location to set
	 */
	public void setLocation(String location) {
		this.location = location;
	}




	@Override
	public String toString() {
		return "LockingStatus [id=" + id + ", month=" + month + ", year=" + year + ", islocked=" + islocked
				+ ", location=" + location + "]";
	}
	
	
	
}
