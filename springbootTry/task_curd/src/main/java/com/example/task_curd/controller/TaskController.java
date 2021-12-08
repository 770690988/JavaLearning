package com.example.task_curd.controller;

import com.example.task_curd.model.AddTaskModel;
import com.example.task_curd.model.TaskResponse;
import com.example.task_curd.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/task")
public class TaskController {
    @Autowired
    private TaskService mTaskService;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public TaskResponse add(@RequestBody AddTaskModel model){
        TaskResponse data = mTaskService.add(model);
        return data;
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<TaskResponse> list(){
        List<TaskResponse> datalist = mTaskService.list();
        return datalist;
    }

    @RequestMapping(value = "/getBystaffID", method = RequestMethod.GET)
    public List<TaskResponse> listbystaffID(@RequestBody String staffID){
        List<TaskResponse> datalist = mTaskService.listbystaffId(staffID);
        return datalist;
    }

    @RequestMapping(value = "/getBytaskTitle", method = RequestMethod.GET)
    public List<TaskResponse> listbytaskTitle(@RequestBody String taskTitle){
        List<TaskResponse> datalist = mTaskService.listbytaskTitle(taskTitle);
        return datalist;
    }

    @RequestMapping(value = "/deleteBytaskId", method = RequestMethod.DELETE)
    public TaskResponse listbytaskId(@RequestBody String taskIdstr){
        Integer taskId = Integer.parseInt(taskIdstr);
        TaskResponse data = mTaskService.deleteBytaskId(taskId);
        return data;
    }

}
