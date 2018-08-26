package com.example.config;

import com.example.interceptor.TestInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
/**
 *@author  瞿亮
 *@create  2018/08/26 16:01
 *@otherInfo
 *@description  适配器   主要是做些请求 处理
 */
@Configuration
public class WebMvcConfigurer extends WebMvcConfigurerAdapter {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        /**
         * 拦截器按照顺序执行
         * interceptor
         */
        registry.addInterceptor(new TestInterceptor()).addPathPatterns("/*/**");

        super.addInterceptors(registry);
    }


}