package com.example.classdemo.service;

import org.springframework.stereotype.Service;
import com.example.classdemo.entitiy.*;
import com.example.classdemo.model.*;

@Service
public class TaskService {
    public void add(){
      Task task = new Task();
      task.title = model.title;
      Task persisted = model.save(task);
      return wrapResponse(persisted);
    }

    private  TaskResponse wrapResponse(Task task){

        return task;
    }
}
