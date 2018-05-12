package com.todo.todoapplication.web.dto;

import java.util.Calendar;

import javax.validation.constraints.NotEmpty;

import com.todo.todoapplication.web.enums.TodoStatus;

public class TaskDTO {

	private int id;
	@NotEmpty
	private String subject;
	private TodoStatus status;
	@NotEmpty
	private String description;
	private Calendar creationDate;

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	@Override
	public String toString() {
		
		if(status != null) {
			return subject + " " + description + " " + status;
		}
		return subject + " " + description;
	}

	public TodoStatus getStatus() {
		return status;
	}

	public void setStatus(TodoStatus status) {
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Calendar getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Calendar creationDate) {
		this.creationDate = creationDate;
	}
}
