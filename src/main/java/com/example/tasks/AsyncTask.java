package com.example.tasks;

import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import java.util.concurrent.Future;

/**
 * @author 瞿亮
 * @create 2018/08/26 15:06
 * @otherInfo
 * @description 异步任务
 */
@Component
public class AsyncTask {

    @Async
    public Future<Boolean> doTask11() throws InterruptedException {
        long start = System.currentTimeMillis();
        Thread.sleep(1000);
        long end = System.currentTimeMillis();
        System.out.println("任务一:" + (end - start) + "毫秒");
        return new AsyncResult<Boolean>(true);
    }


    @Async
    public Future<Boolean> doTask22() throws InterruptedException {
        long start = System.currentTimeMillis();
        Thread.sleep(700);
        long end = System.currentTimeMillis();
        System.out.println("任务二:" + (end - start) + "毫秒");
        return new AsyncResult<Boolean>(true);
    }

    @Async
    public Future<Boolean> doTask33() throws InterruptedException {
        long start = System.currentTimeMillis();
        Thread.sleep(500);
        long end = System.currentTimeMillis();
        System.out.println("任务三:" + (end - start) + "毫秒");
        return new AsyncResult<Boolean>(true);
    }
}