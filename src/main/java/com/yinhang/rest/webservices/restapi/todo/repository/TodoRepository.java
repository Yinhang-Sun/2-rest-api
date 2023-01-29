package com.yinhang.rest.webservices.restapi.todo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yinhang.rest.webservices.restapi.todo.Todo;

public interface TodoRepository extends JpaRepository<Todo, Integer>{
	List<Todo> findByUsername(String username);
}
