package com.budgettracking.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class UserDTO {
	
	private String fullname;
	private String username;
	private String roles; 
	private String password;
	
	
	private String address;
	private String department;
	private String designation;
    private String city;
    private String country;

//	private String customer_name;

	private String email_id;

	private String mobile_no;

	private String phone;

	private String state;

	private String zip;
	
}
