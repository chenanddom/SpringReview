package com.flexible.config;

import com.flexible.condition.LinuxCondition;
import com.flexible.condition.WindowsCondition;
import com.flexible.service.LinuxListService;
import com.flexible.service.ListService;
import com.flexible.service.WindowsService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: chendom
 * Date: 2018-12-21
 * Time: 12:38
 */
@Configuration
public class ConditionConfig {
@Bean
@Conditional(WindowsCondition.class)
public ListService windowsService(){
    return new WindowsService();
}
@Bean
@Conditional(LinuxCondition.class)
public ListService linuxService(){
    return new LinuxListService();
}

}
