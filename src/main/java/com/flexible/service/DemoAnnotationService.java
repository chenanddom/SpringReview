package com.flexible.service;

import com.flexible.annotation.Action;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 * Description:使用注解被拦截的类
 * User: chendom
 * Date: 2018-12-20
 * Time: 10:20
 */
@Service
public class DemoAnnotationService {

    @Action(value = "注解拦截的当前的add方法")
    public void add() {
    }
}
