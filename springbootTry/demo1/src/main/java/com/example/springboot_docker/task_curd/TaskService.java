package com.example.springboot_docker.task_curd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.springboot_docker.Entity.*;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class TaskService {
    @Autowired
    private TaskMapper mMapper;

    public TaskResponse add(AddTask model){
        Task task=new Task();
        task.taskID= UUID.randomUUID().toString();
        task.title=model.title;
        task.createTime=model.time;
        task.staffID=model.refUrl;
        task.ref_link=model.ref_link;
        Task persisted= mMapper.save(task);
        return wrapForResponse(persisted);
    }

}
