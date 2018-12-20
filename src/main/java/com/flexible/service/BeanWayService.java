package com.flexible.service;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: chendom
 * Date: 2018-12-20
 * Time: 14:27
 */
public class BeanWayService {

    public void init(){
        System.out.println("@Bean-init-method");
    }

    /**
     * 构造函数
     */
    public BeanWayService() {
        System.out.println("初始化构造函数-BeanWayService");
    }

    /**
     * 销毁方法
     */
    public void destroy(){
        System.out.println("@Bean-destroy-method");
    }
}
