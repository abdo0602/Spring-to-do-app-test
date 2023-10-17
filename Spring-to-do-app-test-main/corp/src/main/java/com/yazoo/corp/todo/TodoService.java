package com.yazoo.corp.todo;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

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

  public Optional<Todo> getTodo(Long id){
    Optional<Todo> todo = todoRepository.findById(id);
    if(todo == null){
       throw new IllegalStateException("Todo with Id: "+id+" was not found!");
    }
    return todo;
  }

  public void addTodo(Todo todo){
    if(todo.getTitle() == null || todo.getContent() == null){
      throw new IllegalStateException("title and content cannot be empty");
    }
    todoRepository.save(todo);
  }

  @Transactional
  public void updateTodo(Long id,String title,String content,Integer isComplete){
      Todo todo = todoRepository.findById(id).orElseThrow(()-> new IllegalStateException("Todo with id: "+id+" was not found"));
      if(todo == null){
        throw new IllegalStateException("Todo with Id: "+id+" was not found!");
      }
      else{
      if(isComplete == 1){
        todo.setIsComplete(true);
      }
      else{
        if(title != null && title.length() > 0 && !Objects.equals(todo.getTitle(), title)){
          todo.setTitle(title);
        }
        if(content != null && content.length() > 0 && !Objects.equals(todo.getContent(), content)){
          todo.setContent(content);
        }
      }
    }
   }

  public void deleteTodo(Long id){
    todoRepository.deleteById(id);
  }
}
