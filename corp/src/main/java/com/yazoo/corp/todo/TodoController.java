package com.yazoo.corp.todo;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path ="api/todo")
public class TodoController{

  private final TodoService todoService;
  @Autowired
  public TodoController(TodoService todoService){
    this.todoService = todoService;
  }
  
  @GetMapping
  public List<Todo> getTodods(){
    System.out.println("test");
    return todoService.getTodos();
  }

  @GetMapping(path="{id}")
  public Optional<Todo> getTodo(@PathVariable Long id){
    return (Optional<Todo>) todoService.getTodo(id);
  }

  @PostMapping
  public void addTodo(@RequestBody Todo todo){
    todoService.addTodo(todo);
  }

  @PutMapping(path = "{id}")
  public void updateTodo(@PathVariable("id") Long id,
                        @RequestParam(required = false) String title,
                         @RequestParam(required = false) String content,
                         @RequestParam(required = false) Integer isComplete
                        ){
    todoService.updateTodo(id,title,content);
                        }

  @DeleteMapping(path = "{id}")
  public void deleteTodo(@PathVariable("id") Long id){
    todoService.deleteTodo(id);
  }
}
