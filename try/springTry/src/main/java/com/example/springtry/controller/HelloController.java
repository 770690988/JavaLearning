package com.example.springtry.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author YCL
 * @data 2021/10/24 15:51
 */

//@Controller //spring管理：spring将该类纳入到spring容器当中：
@RestController
public class HelloController {
    /**
     * 完成一个异步响应
     * @author YCL
     * @data 2021/10/24 15:51
     */
    @RequestMapping("/hello2")
    //@ResponseBody
    public  String helloController(String name){
        System.out.println("hello 执行了...." + name);
        return "你的姓名是:"+name;
    }
}
/*
上述的两个注解
@Controller
@ResponseBody
这两个注解可以用一个注解来表示
即@ResponseBody来表示
 */
