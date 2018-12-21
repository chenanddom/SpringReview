package com.flexible.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: chendom
 * Date: 2018-12-21
 * Time: 10:30
 */
@Configuration
@ComponentScan("com.flexible")
@EnableScheduling
public class ScheDuledTaskConfig {
}
