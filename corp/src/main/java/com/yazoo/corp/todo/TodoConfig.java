package com.yazoo.corp.todo;

import java.util.List;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TodoConfig {
    
    @Bean
    CommandLineRunner commandLineRunner(TodoRepository todoRepository){
        return args -> {
            Todo a= new Todo("task 1", "content 1");
            Todo b= new Todo("Task 2", "content 2");
            todoRepository.saveAll(List.of(a,b));
        };
    }
}
