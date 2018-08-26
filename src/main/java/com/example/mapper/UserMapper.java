package com.example.mapper;

import com.example.pojo.SysUser;
import com.example.utils.MyMapper;
import org.springframework.stereotype.Component;

@Component
public interface UserMapper extends MyMapper<SysUser> {
}