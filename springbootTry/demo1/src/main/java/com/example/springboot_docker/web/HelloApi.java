package com.example.springboot_docker.web;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 样例 Http Rest 服务
 *
 * @author 虞程龙
 * @since 2021-11-7
 */

@RestController
@RequestMapping("/api/v1/hello")
public class HelloApi {
    @RequestMapping("/say/{name}")
    String sayHello(@PathVariable String name) {
        return "Hello," + name + "!";
    }
}