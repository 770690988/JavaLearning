package com.example.ais_task2.service;

import com.example.ais_task2.entity.Task;
import com.example.ais_task2.mapper.TaskMapper;
import com.example.ais_task2.model.AddTask;
import com.example.ais_task2.model.TaskResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
public class TaskService {
    @Autowired
    private TaskMapper mMapper;

    @Transactional
    public TaskResponse add(AddTask model){
        Task task=new Task();
        task.title=model.title;
        task.category=model.category;
        task.detail= model.detail;
        Task persisted= mMapper.save(task);
        return wrapForResponse(persisted);
    }

    private TaskResponse wrapForResponse(Task task){
        TaskResponse data=new TaskResponse();
        data.taskID=task.taskID;
        data.created_id=task.created_id;
        data.title=task.title;
        data.category=task.category;
        data.detail=task.detail;
        return data;
    }

    private List<TaskResponse> wrapListForResponse(List<Task> itemList){
        List<TaskResponse> dataList= itemList.stream().map(new Function<Task, TaskResponse>() {
            @Override
            public TaskResponse apply(Task task) {
                return wrapForResponse(task);
            }
        }).collect(Collectors.toList());
        return dataList;
    }

    public List<TaskResponse> lookupByTitleForResponse(String title){
        List<Task> itemTask=mMapper.lookupByTitle(title);
        return wrapListForResponse(itemTask);
    }
}
