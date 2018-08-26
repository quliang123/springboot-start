package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 123
 * @CreateTime 2018/08/24
 * Created by 123 on 2018/08/24.
 */
@RequestMapping("/err")
@Controller
public class ErrorController {

    @RequestMapping("/ajaxError")
    public String ajaxError() {
        return "thymeleaf/ajaxerror";
    }

    @RequestMapping("/getAjaxerror")
    public String getAjaxerror() {
        int a = 1 / 0;
        return "thymeleaf/ajaxerror";
    }


    @RequestMapping("/error")
    public String error() {
        int a = 1 / 0;
        return "thymeleaf/error";
    }

}
