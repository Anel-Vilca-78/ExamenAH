package com.example.examenvilca.infraestructure.configs;

import com.example.examenvilca.application.services.DomainToDoListServiceImpl;
import com.example.examenvilca.application.services.ITodoListService;
import com.example.examenvilca.domain.ports.IToDoListRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class BeanToDoListConfiguration {
    @Bean
    ITodoListService ToDoListBeanService(final IToDoListRepository repository){
        return new DomainToDoListServiceImpl(repository);
    }
}
