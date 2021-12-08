package com.example.ais_task2.mapper;

import com.example.ais_task2.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TaskMapper extends JpaRepository<Task,Integer> {

    @Query("FROM Task")
    List<Task> list();

    @Query("FROM Task t WHERE t.title LIKE :title")
    List<Task> lookupByTitle(@Param("title") String title);

}
