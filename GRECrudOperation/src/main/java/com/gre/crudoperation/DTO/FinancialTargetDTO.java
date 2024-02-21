package com.gre.crudoperation.DTO;

import java.util.Date;
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
public class FinancialTargetDTO {

	
	
	private int ftid;
	private Date date;

	private Double q1;
	private Double q2;
	private Double q3;
	private Double q4;
	
	private Double year_target;
	
	private List<UserDTO> user;


}
