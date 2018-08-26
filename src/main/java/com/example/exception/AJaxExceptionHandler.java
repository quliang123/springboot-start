package com.example.exception;

import com.example.pojo.PageResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author 123
 * @CreateTime 2018/08/24
 * Created by 123 on 2018/08/24.
 */
//@RestControllerAdvice
public class AJaxExceptionHandler {

//    @ExceptionHandler(value = Exception.class)
    public Object defaultErrorHandler(HttpServletRequest request, HttpServletResponse response, Exception e) {
        e.printStackTrace();
        return new PageResult(0, e.getMessage(), 0, "");
    }


}
