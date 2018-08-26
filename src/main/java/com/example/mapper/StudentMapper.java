package com.example.mapper;

import com.example.pojo.Student;
import com.example.utils.MyMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface StudentMapper extends MyMapper<Student> {

}