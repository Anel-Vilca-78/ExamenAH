package com.example.examenvilca.infraestructure.adapters;

import com.example.examenvilca.infraestructure.entities.ToDoListEntity;
import org.springframework.data.repository.CrudRepository;

public interface IToDoListCrudRepositoryMySql extends CrudRepository<ToDoListEntity, String> {
}
