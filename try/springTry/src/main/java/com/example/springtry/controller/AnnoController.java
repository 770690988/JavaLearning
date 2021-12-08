package com.example.springtry.controller;


import org.springframework.web.bind.annotation.*;

@RestController
public class AnnoController {
    @RequestMapping(value = "/anno", method = RequestMethod.POST)
    public String testRequestParam(@RequestBody Task task){
        System.out.println(task.toString());
        return task.toString();
    }
}
