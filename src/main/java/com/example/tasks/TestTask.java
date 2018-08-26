package com.example.tasks;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author 瞿亮
 * @create 2018/08/26 14:51
 * @otherInfo
 * @description 用来测试定时任务
 */
@Component
public class TestTask {

    private static final SimpleDateFormat SIMPLE_DATE_FORMAT = new SimpleDateFormat("HH:mm:ss");

    //    定义每过五秒执行任务  (毫秒)
//    @Scheduled(fixedRate = 3000)
    @Scheduled(cron = "4-40 * * * * ?")
    public void reportCurrentTime() {
        System.out.println("当前时间" + SIMPLE_DATE_FORMAT.format(new Date()));
    }
}