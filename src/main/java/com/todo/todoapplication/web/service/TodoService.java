package com.todo.todoapplication.web.service;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Optional;

import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.todo.todoapplication.web.dto.TaskDTO;
import com.todo.todoapplication.web.enums.TodoStatus;
import com.todo.todoapplication.web.model.Todo;
import com.todo.todoapplication.web.repository.TodoRepository;

@Service
public class TodoService {

	@Autowired
	private TodoRepository repository;

	public TaskDTO saveNewTask(TaskDTO dto) {
		Todo todo = new Todo();
		try {
			BeanUtils.copyProperties(todo, dto);
			todo.setStatus(TodoStatus.PENDING);
			todo.setCreationDate(Calendar.getInstance());
			todo = repository.save(todo);
			BeanUtils.copyProperties(dto, todo);
		} catch (IllegalAccessException | InvocationTargetException e) {
			e.printStackTrace();
		}

		return dto;
	}

	public List<TaskDTO> getAllTasks () {
		List<TaskDTO> dtoList= new ArrayList<TaskDTO>();
		List<Todo> list = (List<Todo>) repository.findAll();
		for (Todo todo : list) {
			TaskDTO dto = new TaskDTO();
			try {
				BeanUtils.copyProperties(dto, todo);
				dtoList.add(dto);
			} catch (IllegalAccessException | InvocationTargetException e) {
				e.printStackTrace();
			}
		}
		return dtoList;
	}

	public void deleteTask(int id) {
		repository.deleteById(id);
	}

	public void completeTask(int id) {
		Optional<Todo> optional = repository.findById(id);
		if(optional.isPresent()) {
			Todo todo = optional.get();
			todo.setStatus(TodoStatus.COMPLETED);
			repository.save(todo);
		}
		
	}
}
