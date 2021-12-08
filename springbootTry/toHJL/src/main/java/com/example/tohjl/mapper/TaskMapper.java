package com.example.tohjl.mapper;

import com.example.tohjl.entity.Task;
import io.lettuce.core.dynamic.annotation.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TaskMapper extends JpaRepository<Task, Integer> {
    @Query("FROM Task t")
    List<Task> task();

    @Query("FROM Task t WHERE t.task_id = :task_id")
    Task lookupById(@Param("task_id") Integer task_id);

    @Query("FROM Task t WHERE t.task_title = :task_title")
    List<Task> lookupByTitle(@Param("task_title") String task_title);

    @Query("FROM Task t WHERE t.creator_staff_id = :creator_staff_id")
    List<Task> lookupBystaffID(@Param("create_staff_id") String creator_staff_id);
}
