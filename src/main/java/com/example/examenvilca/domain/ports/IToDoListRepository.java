package com.example.examenvilca.domain.ports;

import com.example.examenvilca.domain.models.ToDoList;

import java.util.Optional;

public interface IToDoListRepository {
    ToDoList create(ToDoList subject);
    ToDoList update(ToDoList subject);
    void delete(String id);
    Iterable<ToDoList> list();
    Optional<ToDoList> get(String id);
}
