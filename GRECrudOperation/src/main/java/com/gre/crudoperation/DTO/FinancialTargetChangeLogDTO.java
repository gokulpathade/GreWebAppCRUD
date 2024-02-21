package com.gre.crudoperation.DTO;

import java.sql.Timestamp;
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
public class FinancialTargetChangeLogDTO {

//	private int ftclogid;
	private Date date;
	private Timestamp log_date;
	private Double q1;
	private Double q2;
	private Double q3;
	private Double q4;
	
	private Double year_target;
	
	

	
	private List<UserDTO> user;
}
