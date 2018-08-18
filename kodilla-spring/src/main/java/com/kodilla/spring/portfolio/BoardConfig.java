package com.kodilla.spring.portfolio;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;

@Configuration
public class BoardConfig {

    @Bean
    public Board board() {
        return new Board(getToDoList(), getInProgressList(), getDoneList());
    }

    @Bean(name = "toDoList")
    public TaskList getToDoList() {
        return new TaskList();
    }

    @Bean (name = "inProgressList")
    public TaskList getInProgressList() {
        return new TaskList();
    }

    @Bean (name = "doneList")
    public TaskList getDoneList() {
        return new TaskList();
    }
}