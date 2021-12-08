package com.example.tohjl.servise;

import com.example.tohjl.entity.Task;
import com.example.tohjl.mapper.TaskMapper;
import com.example.tohjl.model.AddTaskModel;
import com.example.tohjl.model.TaskResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class TaskServer {
    @Autowired
    private TaskMapper mMapper;

    public TaskResponse add(AddTaskModel model){
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd :HH:mm:ss");
        Task task = new Task();
        task.created_at = dateFormat.format(date);
        task.task_title = model.task_title;
        task.creator_staff_id = model.creator_staff_id;
        task.detail = model.detail;
        task.ref_link = model.ref_link;
        Task persisted = mMapper.save(task);
        return wrapForResponse(persisted);
    }

    private TaskResponse wrapForResponse(Task persisted) {
        return new TaskResponse(persisted);
    }


    public List<TaskResponse> list() {
        List<Task> taskList = mMapper.task();
        return wrapListForResponse(taskList);
    }

    public List<TaskResponse> listbytaskTitle(String taskTitle) {
        List<Task> taskList = mMapper.lookupByTitle(taskTitle);
        return wrapListForResponse(taskList);
    }

    public List<TaskResponse> listbystaffId(String staffId) {
        List<Task> taskList = mMapper.lookupBystaffID(staffId);
        return wrapListForResponse(taskList);
    }

    private List<TaskResponse> wrapListForResponse(List<Task> taskList) {
        List<TaskResponse> dataList=new ArrayList<>();
        for(Task task:taskList){
            TaskResponse data=wrapForResponse(task);
            dataList.add(data);
        }
        return dataList;
    }

    public TaskResponse deleteBytaskId(Integer taskId) {
        Task task= mMapper.lookupById(taskId);
        mMapper.deleteById(taskId);
        return new TaskResponse(task);
    }
}
