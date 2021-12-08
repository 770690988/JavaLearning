package com.example.tohjl.controller;

import com.example.tohjl.model.AddTaskModel;
import com.example.tohjl.model.TaskResponse;
import com.example.tohjl.servise.TaskServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/task")
public class TaskController {
    @Autowired
    private TaskServer mTaskService;

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
