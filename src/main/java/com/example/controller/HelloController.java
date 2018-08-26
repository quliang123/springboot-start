package com.example.controller;

import com.example.pojo.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 123
 * @CreateTime 2018/08/23
 * Created by 123 on 2018/08/23.
 */
@Controller
public class HelloController {


    @Autowired
    private Resource resource;

    @ResponseBody
    @RequestMapping("/getResource")
    public Object getResource() {
        return new Resource();
    }


    //    第一个例子
    @RequestMapping("/hello")
    public Object hello() {
        return "hello stringboot~~~~";
    }
}
