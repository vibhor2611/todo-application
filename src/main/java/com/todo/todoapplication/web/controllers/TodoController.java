package com.todo.todoapplication.web.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.todo.todoapplication.web.dto.TaskDTO;
import com.todo.todoapplication.web.service.TodoService;

@Controller
public class TodoController {

	@Autowired
	private TodoService service;

	@RequestMapping(value = "/newTask", method = RequestMethod.POST)
	public String newTask(@Valid TaskDTO dto) {
		service.saveNewTask(dto);
		return "redirect:home";
	}
	
	@RequestMapping(value = "/deleteTask", method = RequestMethod.GET)
	public String deleteTask(@RequestParam int id) {
		service.deleteTask(id);
		return "redirect:home";
	}
	
	@RequestMapping(value = "/completeTask", method = RequestMethod.GET)
	public String completeTask(@RequestParam int id) {
		service.completeTask(id);
		return "redirect:home";
	}
}
