package com.yazoo.corp.todo;
import org.springframework.data.JpaRepository;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Long>{
  
}
