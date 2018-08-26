package com.example.mapper;

import com.example.pojo.SysUser;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface UserMapperCustom {

    public List<SysUser> queryUserSimplyInfoById(String id);

}