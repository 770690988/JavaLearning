package com.example.springboot_docker.Entity;

import org.hibernate.annotations.Tables;

import javax.persistence.*;

@Entity
@Table(name = "task",indexes = {@Index(columnList = "creator")})
public class Task {
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Id
    @Column(name = "task_id")
    public String taskID;

    @Column(name = "creator")
    public String creator;

    @Column(name = "created_at")
    public String createTime;

    @Column(name = "creator_staff_id")
    public String staffID;

    @Column(name = "title")
    public String title;

    @Column(name = "ref_link")
    public String ref_link;

    @Column(name = "detail")
    @Lob
    public String detail;

    public String getTaskID() {
        return taskID;
    }

    public void setTaskID(String taskID) {
        this.taskID = taskID;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getStaffID() {
        return staffID;
    }

    public void setStaffID(String staffID) {
        this.staffID = staffID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getRef_link() {
        return ref_link;
    }

    public void setRef_link(String ref_link) {
        this.ref_link = ref_link;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    @Override
    public String toString() {
        return "Task{" +
                "taskID='" + taskID + '\'' +
                ", creator='" + creator + '\'' +
                ", createTime='" + createTime + '\'' +
                ", staffID='" + staffID + '\'' +
                ", title='" + title + '\'' +
                ", ref_link='" + ref_link + '\'' +
                ", detail='" + detail + '\'' +
                '}';
    }
}
