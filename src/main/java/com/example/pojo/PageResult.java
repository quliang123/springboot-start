package com.example.pojo;

/**
 * @author 123
 * @CreateTime 2018/08/24
 * Created by 123 on 2018/08/24.
 */

public class PageResult {
    private Integer code;

    private String msg;

    private Integer count;

    private Object data;

    /**
     * @param code  状态码
     * @param msg   内容
     * @param count 数据条数
     * @param data  数据集
     */
    public PageResult(Integer code, String msg, Integer count, Object data) {
        this.code = code;
        this.msg = msg;
        this.count = count;
        this.data = data;
    }

    public PageResult() {
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}

