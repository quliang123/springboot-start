package com.example.exception;

import com.example.pojo.PageResult;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author 123
 * @CreateTime 2018/08/24
 * Created by 123 on 2018/08/24.
 * 全局异常捕获
 */
@ControllerAdvice
public class TestExceptionHandler {

    private static final String MY_ERROR_VIEW = "thymeleaf/error";

//    @ExceptionHandler(value = Exception.class)
   /* public Object errorHandler(HttpServletRequest request, HttpServletResponse response, Exception e) {
        e.printStackTrace();
        System.out.println("=============" + e);
        ModelAndView mav = new ModelAndView();
        mav.addObject("exception", e);
        mav.addObject("url", request.getRequestURL());
        mav.setViewName(MY_ERROR_VIEW);
        return mav;
    }*/


    @ExceptionHandler(value = Exception.class)
    public Object errorHandler(HttpServletRequest request, HttpServletResponse response, Exception e) {
        System.out.println("======" + isAjax(request));
        if (isAjax(request)) {
            return new PageResult(0, e.getMessage(), 0, "");
        } else {
            ModelAndView mav = new ModelAndView();
            mav.addObject("exception", e);
            mav.addObject("url", request.getRequestURL());
            mav.setViewName(MY_ERROR_VIEW);
            return mav;
        }
    }

    /**
     * 判断是否是ajax请求
     *
     * @param request
     * @return boolean
     */
    public static boolean isAjax(HttpServletRequest request) {
        return (request.getHeader("X-Requested-With") != null && "XMLHttpRequest".equals(request.getHeader("X-Requested-With")));
    }

}
