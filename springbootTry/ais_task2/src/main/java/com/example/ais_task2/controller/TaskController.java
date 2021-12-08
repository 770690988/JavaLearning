package com.example.ais_task2.controller;

import com.example.ais_task2.model.AddTask;
import com.example.ais_task2.model.TaskResponse;
import com.example.ais_task2.response.BaseResponse;
import com.example.ais_task2.response.ResponseFactory;
import com.example.ais_task2.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/task")
public class TaskController {
    @Autowired
    private TaskService mTaskService;

    @Autowired
    private ResponseFactory mResponseFactory;

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public ResponseEntity<BaseResponse<TaskResponse>> add(@RequestBody AddTask model){
        TaskResponse data= mTaskService.add(model);
        return mResponseFactory.produce(data);
    }

    @RequestMapping(value = "/lookupByTitle",method = RequestMethod.GET)
    public ResponseEntity<List<TaskResponse>> lookupByTitle(@RequestParam("title") String title){
        List<TaskResponse> dataList=mTaskService.lookupByTitleForResponse(title);
        return ResponseEntity.ok(dataList);
    }
}
