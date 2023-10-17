package com.yazoo.corp.todo;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping
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

  @PutMapping(path = "{id}")
  public void updateTodo(@PathVariable("id") Long id,
                        @RequestParam(required = false) String title,
                         @RequestParam(required = false) String content,
                         @RequestParam(required = false) Integer isComplete
                        ){
    todoService.updateTodo(id,title,content,isComplete);
                        }

  @DeleteMapping(path = "{id}")
  public void deleteTodo(@PathVariable("id") Long id){
    todoService.deleteTodo(id);
  }
}
