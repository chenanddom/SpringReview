package com.flexible.service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: chendom
 * Date: 2018-12-20
 * Time: 14:33
 */
public class JSR250WayService {
    @PostConstruct
public void init(){
    System.out.println("JSR250-init-method");
}
public JSR250WayService(){
    System.out.println("初始化构造函数-JSR250WayService");
}
@PreDestroy
 public void destroy(){
    System.out.println("JSR250-destroy-method");
}
}
