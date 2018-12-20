package com.flexible.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: chendom
 * Date: 2018-12-20
 * Time: 8:47
 */
@Service
public class UseFunctionService {
@Autowired
    FunctionService functionService;
public String sayHello(String content){
    return functionService.sayHello(content);
}
}
