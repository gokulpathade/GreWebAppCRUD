package com.gre.crudoperation.Entity;

import java.util.Date;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import jakarta.persistence.Table;

@Entity
@Table
public class Notification {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int notification_id;
	private String account_name;
	private String after_change;
	private String before_change;
	private Date created_at;
	private String field;
	private String is_read;

	private String user_name;
	private String ug_id;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "userid")
	// name should match the actual column name in your database
	private User user;

	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "project_id")
	// name should match the actual column name in your database
	private Project project;

	/**
	 * @param user
	 */
	public Notification(User user) {
		super();
		this.user = user;
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

	/**
	 * 
	 */
	public Notification() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param notification_id
	 * @param account_name
	 * @param after_change
	 * @param before_change
	 * @param created_at
	 * @param field
	 * @param is_read
	 * @param project_id
	 * @param user_name
	 * @param ug_id
	 */
	public Notification(int notification_id, String account_name, String after_change, String before_change,
			Date created_at, String field, String is_read, String project_id, String user_name, String ug_id) {
		super();
		this.notification_id = notification_id;
		this.account_name = account_name;
		this.after_change = after_change;
		this.before_change = before_change;
		this.created_at = created_at;
		this.field = field;
		this.is_read = is_read;

		this.user_name = user_name;
		this.ug_id = ug_id;
	}

	@Override
	public String toString() {
		return "Notification [notification_id=" + notification_id + ", account_name=" + account_name + ", after_change="
				+ after_change + ", before_change=" + before_change + ", created_at=" + created_at + ", field=" + field
				+ ", is_read=" + is_read + ", user_name=" + user_name + ", ug_id=" + ug_id + "]";
	}

	/**
	 * @return the notification_id
	 */
	public int getNotification_id() {
		return notification_id;
	}

	/**
	 * @param notification_id the notification_id to set
	 */
	public void setNotification_id(int notification_id) {
		this.notification_id = notification_id;
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
	 * @return the created_at
	 */
	public Date getCreated_at() {
		return created_at;
	}

	/**
	 * @param created_at the created_at to set
	 */
	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}

	/**
	 * @return the field
	 */
	public String getField() {
		return field;
	}

	/**
	 * @param field the field to set
	 */
	public void setField(String field) {
		this.field = field;
	}

	/**
	 * @return the is_read
	 */
	public String getIs_read() {
		return is_read;
	}

	/**
	 * @param is_read the is_read to set
	 */
	public void setIs_read(String is_read) {
		this.is_read = is_read;
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

}
