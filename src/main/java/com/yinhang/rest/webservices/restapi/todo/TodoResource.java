package com.yinhang.rest.webservices.restapi.todo;

<<<<<<< HEAD

=======
>>>>>>> origin/main
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
<<<<<<< HEAD

//@RestController
public class TodoResource {
	
	private TodoService todoService;
	
	public TodoResource(TodoService todoService) {
		this.todoService = todoService;
	}
	
=======
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoResource {

	private TodoService todoService;

	public TodoResource(TodoService todoService) {
		this.todoService = todoService;
	}

>>>>>>> origin/main
	@GetMapping("/users/{username}/todos")
	public List<Todo> retrieveTodos(@PathVariable String username) {
		return todoService.findByUsername(username);
	}
<<<<<<< HEAD

	@GetMapping("/users/{username}/todos/{id}")
	public Todo retrieveTodo(@PathVariable String username,
			@PathVariable int id) {
		return todoService.findById(id);
	}

	@DeleteMapping("/users/{username}/todos/{id}")
	public ResponseEntity<Void> deleteTodo(@PathVariable String username,
=======
	
	@GetMapping("/users/{username}/todos/{id}")
	public Todo retrieveTodo(@PathVariable String username, 
			@PathVariable int id) {
		return todoService.findById(id);
	}
	
	@DeleteMapping("/users/{username}/todos/{id}")
	public ResponseEntity<Void> deleteTodo(@PathVariable String username, 
>>>>>>> origin/main
			@PathVariable int id) {
		todoService.deleteById(id);
		return ResponseEntity.noContent().build();
	}
<<<<<<< HEAD

	@PutMapping("/users/{username}/todos/{id}")
	public Todo updateTodo(@PathVariable String username,
=======
	
	@PutMapping("/users/{username}/todos/{id}")
	public Todo updateTodo(@PathVariable String username, 
>>>>>>> origin/main
			@PathVariable int id, @RequestBody Todo todo) {
		todoService.updateTodo(todo);
		return todo;
	}
<<<<<<< HEAD

	@PostMapping("/users/{username}/todos")
	public Todo createTodo(@PathVariable String username,
			 @RequestBody Todo todo) {
		Todo createdTodo = todoService.addTodo(username, todo.getDescription(), 
				todo.getTargetDate(),todo.isDone() );
=======
	
	@PostMapping("/users/{username}/todos")
	public Todo createTodo(@PathVariable String username, 
			 @RequestBody Todo todo) {
		Todo createdTodo = todoService.addTodo(username, todo.getDescription(), 
				todo.getTargetDate(), todo.isDone());
>>>>>>> origin/main
		
		return createdTodo;
	}

<<<<<<< HEAD
}
=======
}
>>>>>>> origin/main
