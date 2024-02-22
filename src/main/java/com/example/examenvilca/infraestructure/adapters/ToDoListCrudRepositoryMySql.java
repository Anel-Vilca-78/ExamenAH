package com.example.examenvilca.infraestructure.adapters;

import com.example.examenvilca.domain.models.ToDoList;
import com.example.examenvilca.domain.ports.IToDoListRepository;
import com.example.examenvilca.infraestructure.entities.ToDoListEntity;
import com.example.examenvilca.infraestructure.rest.mappers.IToDoListMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@Slf4j
public class ToDoListCrudRepositoryMySql implements IToDoListRepository {
    private final IToDoListCrudRepositoryMySql repository;

    @Autowired
    private IToDoListMapper toDoListMapper;

    public ToDoListCrudRepositoryMySql(IToDoListCrudRepositoryMySql repository) {
        this.repository = repository;
    }

    @Override
    public ToDoList create(ToDoList toDoList) {
        ToDoListEntity topicEntity = this.toDoListMapper.toToDoEntity(toDoList);
        return this.toDoListMapper.toToDoList(this.repository.save(topicEntity));
    }

    @Override
    public ToDoList update(ToDoList toDoList) {
        ToDoListEntity topicEntity = this.toDoListMapper.toToDoEntity(toDoList);
        return this.toDoListMapper.toToDoList(this.repository.save(topicEntity));
    }

    @Override
    public Iterable<ToDoList> list() {
        return this.toDoListMapper.toToDoLists(this.repository.findAll());
    }

    @Override
    public Optional<ToDoList> get(String id) {
        Optional<ToDoListEntity> toDoListEntity = this.repository.findById(id);

        return Optional.of(this.toDoListMapper.toToDoList(toDoListEntity));
    }

    @Override
    public void delete(String id) {
        Optional<ToDoListEntity> toDoListEntity = this.repository.findById(id);
        this.repository.deleteById(toDoListEntity.get().getId());
    }
}
