package com.yazoo.corp.todo;

import jakarta.persistence.*;

@Entity
@Table
public class Todo {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  private String title;
  private String content;
  private Integer isComplete;
  
  public Todo(){
    this.isComplete = 0;
  }

  public Todo(Integer id, String title, String content){
    this.id = id;
      this.title = title;
      this.content = content;
      this.isComplete = 0;
  }

  public Todo(String title, String content){
      this.title = title;
      this.content = content;
      this.isComplete = 0;
  }

  public void setId(Integer id){
    this.id = id;
  }

  public Integer getId(){
    return id;
  }

  public void setTitle(String title){
    this.title = title;
  }

  public String getTitle(){
    return title;
  }

  public void setContent(String content){
  this.content = content;
  }

  public String getContent(){
    return content;
  }

  public void setIsComplete(Integer isComplete){
    this.isComplete = isComplete;
  }

  public Integer getIsComplete(){
    return isComplete;
  }
  
}
