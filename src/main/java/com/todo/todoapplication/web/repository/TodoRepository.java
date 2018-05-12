package com.todo.todoapplication.web.repository;

import org.springframework.data.repository.CrudRepository;

import com.todo.todoapplication.web.model.Todo;

public interface TodoRepository extends CrudRepository<Todo, Integer> {

}
