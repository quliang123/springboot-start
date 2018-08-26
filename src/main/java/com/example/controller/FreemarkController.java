package com.example.controller;

import com.example.pojo.Resource;
import com.example.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

/**
 * @author 123
 * @CreateTime 2018/08/23
 * Created by 123 on 2018/08/23.
 */

//@RestController  =   @Controller+@ResponseBody

@Controller
@RequestMapping("/ftl")
public class FreemarkController {

    @Autowired
    private Resource resource;

    @RequestMapping("/index")
    public String index(ModelMap map) {
        System.out.println("index进来了");
        map.addAttribute("resource", resource);
        return "freemark/index";
    }

    @RequestMapping("/center")
    public String center() {
        System.out.println("center进来了");
        return "freemark/center/center";
    }

}
