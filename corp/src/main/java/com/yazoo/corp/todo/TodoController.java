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

  @GetMapping(path="{id}")
  public Todo getTodo(@PathVariable Long id){
    return todoService.getTodo();
  }

  @PostMapping
  public void addTodo(@RequestBody Todo todo){
    todoService.addTodo(todo);
  }
  
}
