package com.bersan.service;


import com.bersan.model.Todo;

import java.util.List;

public interface TodoService {

    List<Todo> getAllTodos();
    Todo createTodo(Todo todo);
    void deleteTodo(Long id);
    
}
