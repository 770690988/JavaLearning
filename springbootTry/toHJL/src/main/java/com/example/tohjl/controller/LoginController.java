package com.example.tohjl.controller;

import com.example.tohjl.model.*;
import com.example.tohjl.servise.UserServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/user")
public class LoginController {
    @Autowired
    private UserServer mUserServer;

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public UserResponse add(@RequestBody addUser model){
        UserResponse data = mUserServer.add(model);
        return data;
    }

    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public List<UserResponse> listzhanghu(){
        List<UserResponse> list = mUserServer.list();
        return list;
    }

    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String getMima(@RequestBody addUser model){
        String Mima = mUserServer.getMima(model);
        return Mima;
    }

}
