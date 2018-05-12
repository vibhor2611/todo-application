package com.todo.todoapplication.web.service;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.todo.todoapplication.web.dto.TaskDTO;
import com.todo.todoapplication.web.model.Todo;
import com.todo.todoapplication.web.repository.TodoRepository;

@RunWith(SpringRunner.class)
public class TodoServiceTest {
	
	
	@MockBean
	private TodoRepository repository;
	
	@Test
	public void getAllTasksTest () {
		
		Mockito.when(repository.findAll()).thenReturn(new ArrayList<>());
		
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
	}
}
