package com.example.classdemo.entitiy;

import javax.persistence.*;
import com.example.classdemo.model.*;

@Entity
@Table(name = "task")
public class Task {
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Id
    @Column(name = "task_id")
    public String taskID;

    @Column(name = "created_at")
    public String createTime;

    @Column(name = "creator_staff_id")
    public String staffID;

    @Column(name = "title")
    public String title;

    @Column(name = "ref_link")
    public String ref_link;

    @Column(name = "detail")
    @Lob //转化成Longtext 可以存储几万个字
    public String detail;

}