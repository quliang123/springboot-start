package com.example.controller;

import com.example.pojo.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @author 123
 * @CreateTime 2018/08/23
 * Created by 123 on 2018/08/23.
 */

//@RestController  =   @Controller+@ResponseBody

@Controller
@RequestMapping("/student")
public class StudentController {

    @RequestMapping("/getStudent")
    @ResponseBody
    public Student hello() {
        Student student = new Student();
        student.setName("哈哈哈");
        student.setAge(18);
        student.setId(1);
        student.setBirthday(new Date());

        return student;
    }

    @RequestMapping("/getStudentJson")
    @ResponseBody
    public Object getStudentJson() {
        Student student = new Student();
        student.setName("哈哈哈No.3");
        student.setAge(18);
//        student.setId(1);
        System.out.println(student.getName());
        student.setBirthday(new Date());

        return student;
    }
}
