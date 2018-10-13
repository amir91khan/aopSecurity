package com.nt.dto;

import java.io.Serializable;

import lombok.Data;
@Data
public class UserDTO implements Serializable {
	public String uname;
	public String password;

}
