package com.mvgentil.todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mvgentil.todo.model.TodoItem;

public interface TodoRepo extends JpaRepository<TodoItem, Long> {
	
	

}
