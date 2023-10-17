package com.yazoo.corp.todo;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class TodoController{

  private final TodoService todoService;
  @Autowired
  public TodoController(TodoService todoService){
    this.todoService = todoService;
  }
  
  @GetMapping
  public List<Todo> getTodods(){
    return todoService.getTodos();
  }

  @GetMapping(path="{id}")
  public Todo getTodo(@PathVariable Long id){
    return todoService.getTodo(id);
  }

  @PostMapping
  public void addTodo(@RequestBody Todo todo){
    todoService.addTodo(todo);
  }
  
}
