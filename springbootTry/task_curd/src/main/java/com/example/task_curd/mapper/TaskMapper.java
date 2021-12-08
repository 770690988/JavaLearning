package com.example.task_curd.mapper;

import io.lettuce.core.dynamic.annotation.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.task_curd.entity.*;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TaskMapper extends JpaRepository<TaskEntity, Integer> {
    @Query("FROM TaskEntity t")
    List<TaskEntity> task();

    @Query("FROM TaskEntity t WHERE t.task_id = :task_id")
    TaskEntity lookupById(@Param("task_id") Integer task_id);

    @Query("FROM TaskEntity t WHERE t.task_title = :task_title")
    List<TaskEntity> lookupByTitle(@Param("task_title") String task_title);

    @Query("FROM TaskEntity t WHERE t.creator_staff_id = :creator_staff_id")
    List<TaskEntity> lookupBystaffID(@Param("create_staff_id") String creator_staff_id);

}
