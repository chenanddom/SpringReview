package com.flexible.service;

import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: chendom
 * Date: 2018-12-20
 * Time: 8:44
 */
@Service
public class FunctionService {
    public String sayHello(String content){
        return "Hello "+content;
    }
}
