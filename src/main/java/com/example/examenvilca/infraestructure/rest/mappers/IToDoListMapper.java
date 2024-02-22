package com.example.examenvilca.infraestructure.rest.mappers;

import com.example.examenvilca.domain.models.ToDoList;
import com.example.examenvilca.infraestructure.entities.ToDoListEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mappings;
import org.mapstruct.Mapping;

import java.util.Optional;

@Mapper(componentModel = "spring")
public interface IToDoListMapper {

    @Mappings({
            @Mapping(source = "id", target = "id"),
            @Mapping(source = "description", target = "description"),
            @Mapping(source = "tittle", target = "tittle"),
            @Mapping(source = "status", target = "status"),
    }
    )
    ToDoList toToDoList(ToDoListEntity toDoList);
    Iterable<ToDoList> toToDoLists(Iterable<ToDoListEntity> toDoListEntities);

    @InheritInverseConfiguration
    ToDoListEntity toToDoEntity (ToDoList toDoList);

    ToDoList toToDoList(Optional<ToDoListEntity> toDoList);
}
