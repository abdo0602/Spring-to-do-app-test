package com.yazoo.corp.todo;

@Entity
@Table
public class Todo {
  @Id
  @SequenceGenerator(
    name= "todo_sequence",
    sequenceName="todo_sequence",
    allocationSize=1
  )
  @GeneratedValue(
    strategy=GenerationType.SEQUENCE,
    generator= "todo_sequence"
  )
  private Integer id;
  private String title;
  private String content;
  private boolean isComplete;
  
  public void Todo(){
    this.isComplete = false;
  }

  public void Todo(Integer id, String title, String content){
    this.id = id;
      this.title = title;
      this.content = content;
      this.isComplete = false;
  }

  public void todo(String title, String content){
      this.title = title;
      this.content = content;
      this.isComplete = false;
  }

  public void setId(Integer id){
    this.id = id;
  }

  public Integer getId(){
    return id;
  }

  public void setTitle(String name){
    this.name = name;
  }

  public String getTitle(){
    return name;
  }

  public void setContent(String content){
  this.content = content;
  }

  public String getContent(){
    return content;
  }

  public void setIsComplete(boolean isComplete){
    this.isComplete = isComplete;
  }

  public boolean getIsComplete(){
    return isComplete;
  }
  
}
