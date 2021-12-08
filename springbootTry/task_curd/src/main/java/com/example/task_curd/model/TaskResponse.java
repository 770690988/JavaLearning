package com.example.task_curd.model;

import com.example.task_curd.entity.TaskEntity;

public class TaskResponse {
    public Integer task_id;
    public String task_title;
    public String created_at;
    public String creator_staff_id;
    public String ref_link;
    public String detail;

    public TaskResponse(TaskEntity persisted) {
        this.task_id = persisted.task_id;
        this.task_title = persisted.task_title;
        this.created_at = persisted.created_at;
        this.creator_staff_id = persisted.creator_staff_id;
        this.ref_link = persisted.ref_link;
        this.detail = persisted.detail;
    }
}
