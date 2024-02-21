package com.gre.crudoperation.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Entity
@Table
@Data


public class MasterTable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
 private int master_id;
	
	@NotNull(message = "Please Enter abbreviated_name ")
 private String abbreviated_name; 
	
	
	
	@NotNull(message = "Please Enter Address")
 private String address;
	
	
	@NotNull(message = "Please Enter City")
 private String city;
 
 private String country;
 
 @NotNull(message = "Please Enter Customer Name ")
 private String customer_name;
 
 
 @Email(message = "Please Enter Email")
 private String email_id;
 

 @Pattern(regexp = "^\\d{12}$", message = "Please Check Mobile Number")
 private String mobile_no;
 
 @NotNull(message = "Please Enter Notes")
 private String notes;
 
 private String phone;
 
 @NotNull(message = "Please Enter State")
 private String state;
 
 
 private String zip;
 
 
 

/**
 * @param master_id
 * @param abbreviated_name
 * @param address
 * @param city
 * @param country
 * @param customer_name
 * @param email_id
 * @param mobile_no
 * @param notes
 * @param phone
 * @param state
 * @param zip
 */
public MasterTable(int master_id, String abbreviated_name, String address, String city, String country,
		String customer_name, String email_id, String mobile_no, String notes, String phone, String state, String zip) {
	super();
	this.master_id = master_id;
	this.abbreviated_name = abbreviated_name;
	this.address = address;
	this.city = city;
	this.country = country;
	this.customer_name = customer_name;
	this.email_id = email_id;
	this.mobile_no = mobile_no;
	this.notes = notes;
	this.phone = phone;
	this.state = state;
	this.zip = zip;
}
/**
 * 
 */
public MasterTable() {
	super();
	// TODO Auto-generated constructor stub
}
 
 
 
 
 
 
 
@Override
public String toString() {
	return "MasterTable [master_id=" + master_id + ", abbreviated_name=" + abbreviated_name + ", address=" + address
			+ ", city=" + city + ", country=" + country + ", customer_name=" + customer_name + ", email_id=" + email_id
			+ ", mobile_no=" + mobile_no + ", notes=" + notes + ", phone=" + phone + ", state=" + state + ", zip=" + zip
			+ "]";
}
/**
 * @return the master_id
 */
public int getMaster_id() {
	return master_id;
}
/**
 * @param master_id the master_id to set
 */
public void setMaster_id(int master_id) {
	this.master_id = master_id;
}
/**
 * @return the abbreviated_name
 */
public String getAbbreviated_name() {
	return abbreviated_name;
}
/**
 * @param abbreviated_name the abbreviated_name to set
 */
public void setAbbreviated_name(String abbreviated_name) {
	this.abbreviated_name = abbreviated_name;
}
/**
 * @return the address
 */
public String getAddress() {
	return address;
}
/**
 * @param address the address to set
 */
public void setAddress(String address) {
	this.address = address;
}
/**
 * @return the city
 */
public String getCity() {
	return city;
}
/**
 * @param city the city to set
 */
public void setCity(String city) {
	this.city = city;
}
/**
 * @return the country
 */
public String getCountry() {
	return country;
}
/**
 * @param country the country to set
 */
public void setCountry(String country) {
	this.country = country;
}
/**
 * @return the customer_name
 */
public String getCustomer_name() {
	return customer_name;
}
/**
 * @param customer_name the customer_name to set
 */
public void setCustomer_name(String customer_name) {
	this.customer_name = customer_name;
}
/**
 * @return the email_id
 */
public String getEmail_id() {
	return email_id;
}
/**
 * @param email_id the email_id to set
 */
public void setEmail_id(String email_id) {
	this.email_id = email_id;
}
/**
 * @return the mobile_no
 */
public String getMobile_no() {
	return mobile_no;
}
/**
 * @param mobile_no the mobile_no to set
 */
public void setMobile_no(String mobile_no) {
	this.mobile_no = mobile_no;
}
/**
 * @return the notes
 */
public String getNotes() {
	return notes;
}
/**
 * @param notes the notes to set
 */
public void setNotes(String notes) {
	this.notes = notes;
}
/**
 * @return the phone
 */
public String getPhone() {
	return phone;
}
/**
 * @param phone the phone to set
 */
public void setPhone(String phone) {
	this.phone = phone;
}
/**
 * @return the state
 */
public String getState() {
	return state;
}
/**
 * @param state the state to set
 */
public void setState(String state) {
	this.state = state;
}
/**
 * @return the zip
 */
public String getZip() {
	return zip;
}
/**
 * @param zip the zip to set
 */
public void setZip(String zip) {
	this.zip = zip;
}
	
 
 
 

}
