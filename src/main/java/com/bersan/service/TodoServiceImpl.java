package com.bersan.service;

import com.bersan.model.Todo;

import java.util.List;



public class TodoServiceImpl implements TodoService{
    @Override
    public List<Todo> getAllTodos() {
        return List.of();
    }
    
    @Override
    public Todo createTodo(Todo todo) {
        return null;
    }
    
    @Override
    public void deleteTodo(Long id) {
    
    }
}
