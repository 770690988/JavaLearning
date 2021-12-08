package com.example.task_curd.service;

import com.example.task_curd.entity.TaskEntity;
import com.example.task_curd.mapper.*;
import com.example.task_curd.model.AddTaskModel;
import com.example.task_curd.model.TaskResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
@Transactional
public class TaskService {
    @Autowired
    private TaskMapper mMapper;

    public TaskResponse add(AddTaskModel model){
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd :HH:mm:ss");
        TaskEntity task = new TaskEntity();
        task.created_at = dateFormat.format(date);
        task.task_title = model.task_title;
        task.creator_staff_id = model.creator_staff_id;
        task.detail = model.detail;
        task.ref_link = model.ref_link;
        TaskEntity persisted = mMapper.save(task);
        return wrapForResponse(persisted);
    }

    private TaskResponse wrapForResponse(TaskEntity persisted) {
        return new TaskResponse(persisted);
    }


    public List<TaskResponse> list() {
        List<TaskEntity> taskList = mMapper.task();
        return wrapListForResponse(taskList);
    }

    public List<TaskResponse> listbytaskTitle(String taskTitle) {
        List<TaskEntity> taskList = mMapper.lookupByTitle(taskTitle);
        return wrapListForResponse(taskList);
    }

    public List<TaskResponse> listbystaffId(String staffId) {
        List<TaskEntity> taskList = mMapper.lookupBystaffID(staffId);
        return wrapListForResponse(taskList);
    }

    private List<TaskResponse> wrapListForResponse(List<TaskEntity> taskList) {
        List<TaskResponse> dataList=new ArrayList<>();
        for(TaskEntity task:taskList){
            TaskResponse data=wrapForResponse(task);
            dataList.add(data);
        }
        return dataList;
    }

    public TaskResponse deleteBytaskId(Integer taskId) {
        TaskEntity task= mMapper.lookupById(taskId);
        mMapper.deleteById(taskId);
        return new TaskResponse(task);
    }
}
