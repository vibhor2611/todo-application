package com.todo.todoapplication.web.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.todo.todoapplication.web.dto.LoginDTO;
import com.todo.todoapplication.web.dto.TaskDTO;
import com.todo.todoapplication.web.service.LoginService;
import com.todo.todoapplication.web.service.TodoService;

@Controller
@SessionAttributes("name")
public class LoginController {
	@Autowired
	LoginService service;
	@Autowired
	TodoService todoService;

	@RequestMapping(value = "", method = RequestMethod.GET)
	public String showLoginPage(ModelMap model) {
		return "login";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String showWelcomePage(ModelMap model, @Valid LoginDTO dto) {
		// boolean isValidUser = service.validateUser(dto);
//		if (true) {
//			model.put("errorMessage", "Invalid Credentials");
//			return "login";
//		}
		return "redirect:home";
	}

	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String homePage(ModelMap model) {

		List<TaskDTO> list = todoService.getAllTasks();
		model.put("allTasks", list);

		return "welcome";
	}
}