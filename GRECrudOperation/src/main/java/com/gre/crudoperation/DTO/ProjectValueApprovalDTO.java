package com.gre.crudoperation.DTO;

import java.sql.Date;
import java.sql.Timestamp;

import jakarta.validation.constraints.NotNull;
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
public class ProjectValueApprovalDTO {

	private int userid;

	@NotNull(message = "Full name is required")
	private String fullname;

	private String account_name;

	private String after_change;

	private String before_change;
	private Date date_of_approval;

	private Timestamp date_of_request;
	private String flag;

	private String ug_id;

	private String user_name;
	private String sales_stage;

}
