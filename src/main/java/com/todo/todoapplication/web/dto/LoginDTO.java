package com.todo.todoapplication.web.dto;

import javax.validation.constraints.NotEmpty;

import org.springframework.lang.NonNull;

public class LoginDTO {

	@NonNull
	@NotEmpty
	private String name;
	@NonNull
	@NotEmpty
	private String password;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
