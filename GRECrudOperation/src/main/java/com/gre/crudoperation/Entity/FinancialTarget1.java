package com.gre.crudoperation.Entity;

import jakarta.persistence.CascadeType;

//import java.math.Long;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table
public class FinancialTarget1 {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long targetid1;
	private String category;
	private String location;
	private Double apr;
	private Double aug;
	private Double december;
	private Double feb;
	private Double jan;
	private Double july;
	private Double june;
	private Double mar;
	private Double may;
	private Double nov;
	private Double oct;
	private Double sept;
	private int year_id;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "userid")
	// name should match the actual column name in your database
	private User user;

	public FinancialTarget1() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FinancialTarget1(Long targetid1, String category, String location, Double apr, Double aug, Double december,
			Double feb, Double jan, Double july, Double june, Double mar, Double may, Double nov, Double oct,
			Double sept, int year_id) {
		super();
		this.targetid1 = targetid1;
		this.category = category;
		this.location = location;
		this.apr = apr;
		this.aug = aug;
		this.december = december;
		this.feb = feb;
		this.jan = jan;
		this.july = july;
		this.june = june;
		this.mar = mar;
		this.may = may;
		this.nov = nov;
		this.oct = oct;
		this.sept = sept;
		this.year_id = year_id;

	}

	public Long getTargetid1() {
		return targetid1;
	}

	public void setTargetid1(Long targetid1) {
		this.targetid1 = targetid1;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Double getApr() {
		return apr;
	}

	public void setApr(Double apr) {
		this.apr = apr;
	}

	public Double getAug() {
		return aug;
	}

	public void setAug(Double aug) {
		this.aug = aug;
	}

	public Double getDecember() {
		return december;
	}

	public void setDecember(Double december) {
		this.december = december;
	}

	public Double getFeb() {
		return feb;
	}

	public void setFeb(Double feb) {
		this.feb = feb;
	}

	public Double getJan() {
		return jan;
	}

	public void setJan(Double jan) {
		this.jan = jan;
	}

	public Double getJuly() {
		return july;
	}

	public void setJuly(Double july) {
		this.july = july;
	}

	public Double getJune() {
		return june;
	}

	public void setJune(Double june) {
		this.june = june;
	}

	public Double getMar() {
		return mar;
	}

	public void setMar(Double mar) {
		this.mar = mar;
	}

	public Double getMay() {
		return may;
	}

	public void setMay(Double may) {
		this.may = may;
	}

	public Double getNov() {
		return nov;
	}

	public void setNov(Double nov) {
		this.nov = nov;
	}

	public Double getOct() {
		return oct;
	}

	public void setOct(Double oct) {
		this.oct = oct;
	}

	public Double getSept() {
		return sept;
	}

	public void setSept(Double sept) {
		this.sept = sept;
	}

	public int getYear_id() {
		return year_id;
	}

	public void setYear_id(int year_id) {
		this.year_id = year_id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "FinancialTarget1 [targetid1=" + targetid1 + ", category=" + category + ", location=" + location
				+ ", apr=" + apr + ", aug=" + aug + ", december=" + december + ", feb=" + feb + ", jan=" + jan
				+ ", july=" + july + ", june=" + june + ", mar=" + mar + ", may=" + may + ", nov=" + nov + ", oct="
				+ oct + ", sept=" + sept + ", year_id=" + year_id + ", user=" + user + "]";
	}

}
