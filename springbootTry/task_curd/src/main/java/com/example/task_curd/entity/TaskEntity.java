package com.example.task_curd.entity;

import javax.persistence.*;

@Entity
@Table(name = "task")
public class TaskEntity {
    @Id
    @Column(name = "task_id")
    @GeneratedValue(strategy=GenerationType.AUTO)
    public Integer task_id;

    @Column(name = "created_at")
    public String created_at;

    @Column(name = "creator_staff_id")
    public String creator_staff_id;

    @Column(name = "task_title")
    public String task_title;

    @Column(name = "ref_link")
    public String ref_link;

    @Column(name = "detail")
    public String detail;
}
