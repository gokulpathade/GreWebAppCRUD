package com.gre.crudoperation.DTO;


import java.sql.Timestamp;
import java.util.Date;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
@Getter
@Setter

public class ProjectChangeLogDTO {

	private int project_id;
	private String project_name;
	private Timestamp date_of_request;
    private String account_name;
	
	private Date closure_date;
	private Timestamp log_date;
	private Date opp_date;

	private String  p_id;
	
	private Double percentage_probability;
    private String project_description;
	private int project_value;
	private String remark;
    private Date revised_closerdate;
    private String sales_stage;
    
	
}
