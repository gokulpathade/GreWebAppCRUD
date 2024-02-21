package com.gre.crudoperation.DTO;

import java.util.List;

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
public class FinancialTarget1DTO {

//	private Long targetid1;
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


	
	private List<UserDTO> user;
}
