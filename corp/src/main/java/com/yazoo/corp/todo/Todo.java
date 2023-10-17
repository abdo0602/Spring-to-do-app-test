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

  public void Todo(){}

  public void Todo(Integer id, String title, String content){
    this.id = id;
      this.title = title;
      this.content = content;
  }

  public void todo(String title, String content){
      this.title = title;
      this.content = content;
  }

  public void setId(Integer id){
    this.id = id;
  }

  public Integer getId(){
    return id;
  }

  public void setName(String name){
    this.name = name;
  }

  public String getName(){
    return name;
  }

  public void setContent(String content){
  this.content = content;
  }

  public String getContent(){
    return content;
  }
}
