package com.example.ais_task2.entity;

import javax.persistence.*;

@Entity
@Table(name = "task")
public class Task {
    @Id
    @Column(name = "task_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer taskID;

    @Column(name = "creator_staff_id")
    public String creatorStaffID;

    @Column(name = "title")
    public String title;

    @Column(name = "category")
    public String category;

    @Lob
    @Column(name = "detail")
    public String detail;
}
