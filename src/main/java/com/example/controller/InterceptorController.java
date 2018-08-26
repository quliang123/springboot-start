package com.example.controller;

import com.example.pojo.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author 123
 * @CreateTime 2018/08/23
 * Created by 123 on 2018/08/23.
 */

//@RestController  =   @Controller+@ResponseBody

/**
 * @author 瞿亮
 * @create 2018/08/26 16:04
 * @otherInfo
 * @description springboot配置拦截器测试
 */
@Controller
@RequestMapping("/test")
public class InterceptorController {

    @RequestMapping("postform")
    public String postform(Student stu) {
        System.out.println(stu.getName());
        System.out.println(stu.getAge());
        return "redirect:/html/test";
    }

    @RequestMapping("/test")
    public String test(ModelMap map) {
        Student stu = new Student();
        stu.setName("superadmin");
        stu.setBirthday(new Date());
        stu.setAge(18);
        stu.setDesc("<font color='green'><b>hello springboot~~~~</b></font>");
        System.out.println(stu.getDesc());
        map.addAttribute("stu", stu);


        Student stu1 = new Student();
        stu1.setName("hello springboot ~~~");
        stu1.setBirthday(new Date());
        stu1.setAge(1);


        Student stu2 = new Student();
        stu2.setName("hello  ~~~");
        stu2.setBirthday(new Date());
        stu2.setAge(2);


        Student stu3 = new Student();
        stu3.setName("hello springboot");
        stu3.setBirthday(new Date());
        stu3.setAge(3);

        List<Student> studentList = new ArrayList<Student>();
        studentList.add(stu1);
        studentList.add(stu2);
        studentList.add(stu3);

        map.addAttribute("studentList", studentList);


        return "thymeleaf/test";
    }


    @RequestMapping("/index")
    public String index(ModelMap map) {
        System.out.println("index进来了");
        map.addAttribute("name", "springboot 有点难玩呀");
        return "thymeleaf/index";
    }

    @RequestMapping("/center")
    public String center() {
        System.out.println("center进来了");
        return "thymeleaf/center/center";
    }

}
