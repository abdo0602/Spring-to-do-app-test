package com.yazoo.corp.todo;
imports

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

  public void addTodo(Todo todo){
    if(todo.title == null or todo.content == null){
      throw new IllegalStateException("title and content cannot be empty");
    }
    todoRepository.save(todo)
  }
}
