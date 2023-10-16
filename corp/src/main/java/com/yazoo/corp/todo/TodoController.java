package com.yazoo.corp.todo;
imports

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

  
}
