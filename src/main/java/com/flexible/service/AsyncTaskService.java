package com.flexible.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 * Description:任务执行类
 * User: chendom
 * Date: 2018-12-21
 * Time: 9:08
 */
@Service
public class AsyncTaskService {
    //表明该方法时一个异步方法，如果注解时类级别，则编码该类所有的方法都是异步的方法，而这里的方法自动
    //被注入ThreadPoolTaskExecutor作为TaskExecutor
    @Async
    public void executeAsynTask(Integer i) {
        System.out.println("执行异步任务1:" + i);
    }

    @Async
    public void executeAsynTask2(Integer i) {
        System.out.println("执行异步任务2:" + i);
    }
}
