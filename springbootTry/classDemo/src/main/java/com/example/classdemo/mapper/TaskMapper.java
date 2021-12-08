package com.example.classdemo.mapper;

import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TaskMapper extends JpaResposibility<Task,Integer>{

    @Query("FROM Task")
    List<Task> list();

    @Query("FROM Task t WHERE t.title LIKE :title")
    List<>
}
