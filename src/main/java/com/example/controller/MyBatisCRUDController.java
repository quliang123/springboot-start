package com.example.controller;

import com.example.pojo.PageResult;
import com.example.pojo.Student;
import com.example.service.StudentService;
import com.example.service.impl.StudentServiceImpl;
import org.n3r.idworker.Sid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @创建人 瞿亮
 * @创建时间 2018/08/25
 * @描述
 */
@Controller
@RequestMapping("/mybatis")
public class MyBatisCRUDController {


    @Autowired
    private Sid sid;

    @Qualifier("studentServiceImpl")
    @Autowired
    private StudentService studentService;


    @RequestMapping("/saveStudent")
    PageResult saveStudent() {
        String stuId = sid.nextShort();

        Student student = new Student();
        student.setDesc(stuId);
        student.setName("quliang");
        student.setAge(20);

        studentService.insertSelective(student);
        return new PageResult(0, "添加成功", null, "");
    }


    @RequestMapping("/updateStudent")
    PageResult updateStudent() {
        String stuId = sid.nextShort();

        Student student = new Student();
        student.setDesc(stuId);
        student.setName("quliang");
        student.setAge(20);

        studentService.updateByPrimaryKeySelective(student);
        return new PageResult(0, "修改成功", null, "");
    }

    @RequestMapping("/delStudent")
    PageResult delStudent() {
        studentService.deleteByPrimaryKey(1);
        return new PageResult(0, "删除成功", null, "");
    }

    @RequestMapping("/selectStudent")
    PageResult selectStudent() {
        Student student = studentService.selectByPrimaryKey(1);
        return new PageResult(0, "删除成功", null, student);
    }
}
