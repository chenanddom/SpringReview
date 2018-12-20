package com.flexible.service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: chendom
 * Date: 2018-12-20
 * Time: 12:40
 */
@Service
@Scope("prototype")
public class ProtoTypeService {
    public void sayHello(){
        System.out.println("hello...");
    }
}
