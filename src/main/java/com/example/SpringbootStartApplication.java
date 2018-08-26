package com.example;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;


// 扫描mybatis mapper包路径
@MapperScan(basePackages = "com.example.mapper")
//springboot 程序注解
@SpringBootApplication
// 扫描需要的包   包含自用的工具包所在路径
@ComponentScan(basePackages = {"com.example", "org.n3r.idworker"})
//开启定时任务
//@EnableScheduling

@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})
//异步任务开关
//@EnableAsync
public class SpringbootStartApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootStartApplication.class, args);
    }
}
