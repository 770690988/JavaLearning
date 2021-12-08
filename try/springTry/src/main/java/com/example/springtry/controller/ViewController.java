package com.example.springtry.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ViewController {

    public static final String PAGE = "view";
    /*
    不带数据直接返回页面
     */

    @RequestMapping("view")// url: http://localhost:8080/view
    public String view(){
        return PAGE;
    }

    /*
    带数据的返回
     */
    @RequestMapping("data")// url: http://localhost:8080/data
    public ModelAndView data(){
        ModelAndView view = new ModelAndView(PAGE);
        view.addObject("str1","我叫 hello!");
        view.addObject("str2","我是张三");
        return view;

    }
}
