package com.yazoo.corp.todo;

public class TodoService{

  public List<Todo> getTodos(){

    return List.of(new Todo("title","content"));
  }
}
