package com.todo.todoapplication.web.service;

import org.springframework.stereotype.Service;

import com.todo.todoapplication.web.dto.LoginDTO;

@Service
public class LoginService {

	public boolean validateUser(LoginDTO dto) {

		if (!"Vibhor".equalsIgnoreCase(dto.getName()) && !"Vibhor".equalsIgnoreCase(dto.getPassword())) {
			return false;
		}

		return true;
	}

}
