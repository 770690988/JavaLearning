package com.example.tohjl.mapper;

import com.example.tohjl.entity.*;
import io.lettuce.core.dynamic.annotation.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface LoginMapper extends JpaRepository<User, Integer> {
    @Query("FROM User")
    List<User> user();

    @Query("FROM User u WHERE u.staff_id = :staff_id")
    User lookupmimaBystaffID(@Param("staff_id") String staff_id);
}
