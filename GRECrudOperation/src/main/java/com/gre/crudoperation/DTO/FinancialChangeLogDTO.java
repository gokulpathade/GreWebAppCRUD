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
@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
public class FinancialChangeLogDTO {
	

	private Date date;
	private Timestamp log_date;
	private Double offshort;
	private Double on_site;
	private Double total;

	private List<UserDTO> user;
}
