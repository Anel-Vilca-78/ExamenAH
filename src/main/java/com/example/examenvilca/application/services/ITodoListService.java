package com.example.examenvilca.application.services;

import com.example.examenvilca.domain.models.ToDoList;

import java.util.Optional;

public interface ITodoListService {
    ToDoList create(ToDoList topic);
    ToDoList update(ToDoList topic);
    Iterable<ToDoList> list();
    Optional<ToDoList> get(String id);
    void delete(String id);
}
