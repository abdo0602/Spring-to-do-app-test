package com.yazoo.corp.todo;
imports

@Service
public class TodoService{
  
  public List<Todo> getTodos(){
    return List.of(new Todo("title","content"));
  }
}
