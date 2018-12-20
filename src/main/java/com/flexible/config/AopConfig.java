package com.flexible.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: chendom
 * Date: 2018-12-20
 * Time: 10:32
 */
@Configuration
@ComponentScan("com.flexible")
@EnableAspectJAutoProxy
public class AopConfig {
}
