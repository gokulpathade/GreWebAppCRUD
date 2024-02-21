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

public class NotificationDTO {


	private String account_name;
	private String after_change;
	private String before_change;
	private Date created_at;
	private String field;
	private String is_read;
	private String user_name;
	private String ug_id;
	private List<UserDTO> userdto;
}
