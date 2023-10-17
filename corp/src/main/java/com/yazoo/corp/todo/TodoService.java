package com.yazoo.corp.todo;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Service;

@Service
public class TodoService{

  private final TodoRepository todoRepository;
  @Autowired
  public TodoService(TodoRepository todoRepository){
    this.todoRepository = todoRepository;
  }
  
  public List<Todo> getTodos(){
    return todoRepository.findAll();
  }

  public Todo getTodo(Long id){
    Todo todo = todoRepository.findById(id).orElseThrow(()-> IllegalStateException("Todo with Id: "+id+" was not found!"));
    return todo;
  }

  public void addTodo(Todo todo){
    if(todo.title == null or todo.content == null){
      throw new IllegalStateException("title and content cannot be empty");
    }
    todoRepository.save(todo)
  }

  @Transactional
  public void updateTodo(Long id,String title,String content,Integer isComplete){
      Todo todo = todoRepository.findById(id).orElseThrow(()-> IllegalStateException("Todo with Id: "+id+" was not found!"));
      if(isComplete == 1){}
      else{
        if(title != null && title.length() > 0 && !Objects.equals(todo.title, title)){
          todo.setTitle(title);
        }
        if(content != null && content.length() > 0 && !Objects.equals(todo.content, content)){
          todo.setContent(content);
        }
      }
   }

  public void deleteTodo(Long id){
    todoRepository.deleteById(id);
  }
}
