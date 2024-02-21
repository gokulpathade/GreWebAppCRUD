package com.budgettracking.model;

import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;




@Entity
@Table
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User implements UserDetails {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userid;
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

	private String email;

	private String mobile_no;

	private String phone;

	private String state;

	private String zip;
	
	
	
//	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
////	@JoinColumn(name = "notification_id")
//	private List<UserInformation> userInformation;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
//	@JoinColumn(name = "notification_id")
	private List<FinancialBudget> financialBudget;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
//	@JoinColumn(name = "notification_id")
	private List<HardwareCost> hardwareCost;
	
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
//	@JoinColumn(name = "notification_id")
	private List<SoftwareCost> softwareCost;
	
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
//	@JoinColumn(name = "notification_id")
	private List<TravelExpenses> travelExpenses;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
//	@JoinColumn(name = "notification_id")
	private List<OfficeExpenses> officeExpenses;
	
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
//	@JoinColumn(name = "notification_id")
	private List<SalesAndMarketing> salesAndMarketing;


	
	
	
	
	/**
	 * Returns the password used to authenticate the user.
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Returns the username used to authenticate the user. Cannot return
	 * <code>null</code>.
	 * @return the username (never <code>null</code>)
	 */
	public String getUsername() {
		return email;
	}
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return List.of(new SimpleGrantedAuthority(roles));
	}


	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}


	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}


	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}


	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}
	
}
