package com.flexible.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: chendom
 * Date: 2018-12-21
 * Time: 10:13
 */
@Service
public class ScheDuledTaskService {

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
    //通过@Scheduled声明该方法时计划任务，使用fixedRate属性每隔固定时间执行
    @Scheduled(fixedRate = 5000) //1
    public void reportCurrentTime() {
        System.out.println("每隔五秒执行一次 " + dateFormat.format(new Date()));
    }
//使用cron属性可以按照指定的时间执行，
    @Scheduled(cron = "0/10 * * * * ?"  ) //2
    public void fixTimeExecution(){
        System.out.println("在指定时间 " + dateFormat.format(new Date())+"执行");
    }
}
