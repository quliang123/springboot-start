package com.example.interceptor;

import com.example.pojo.PageResult;
import com.example.utils.JsonUtils;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.constraints.Null;
import java.io.IOException;
import java.io.OutputStream;

public class TestInterceptor implements HandlerInterceptor {
    /**
     * 请求处理之前调用 (Controller方法调用之前)
     *
     * @param httpServletRequest
     * @param httpServletResponse
     * @param o
     * @return
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        System.out.println("被测试拦截器拦截,放行....");
        return true;
    }

    /**
     * 请求处理之后进行调用,但是在视图渲染之前  (Controller调用之后)
     *
     * @param httpServletRequest
     * @param httpServletResponse
     * @param o
     * @param modelAndView
     * @throws Exception
     */
    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }


    /**
     * 在整个请求结束之后被调用,也就是在dispatcherServlet渲染了对应的视图之后执行
     * (主要是用于进行资源清理工作)
     *
     * @param httpServletRequest
     * @param httpServletResponse
     * @param o
     * @param e
     * @throws Exception
     */
    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }


    public void returnErrorResponse(HttpServletResponse response, PageResult result) throws Exception {
        OutputStream out = null;
        try {
            response.setCharacterEncoding("UTF-8");
            response.setContentType("text/json");
            out = response.getOutputStream();
            out.write(JsonUtils.objectToJson(result).getBytes());
            out.flush();
        } catch (Exception e) {
            if (out != null) {
                out.close();
            }
        }
    }


}