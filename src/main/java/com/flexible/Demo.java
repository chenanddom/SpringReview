package com.flexible;

import com.flexible.bean.DemoBean;
import com.flexible.config.*;
import com.flexible.event.DemoPublisher;
import com.flexible.service.*;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.scheduling.annotation.AsyncConfigurer;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: chendom
 * Date: 2018-12-20
 * Time: 8:43
 */
public class Demo {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext configApplicationContext = new AnnotationConfigApplicationContext(DiConfig.class);
        UseFunctionService u = configApplicationContext.getBean(UseFunctionService.class);
        String test = u.sayHello("test");
        System.out.println(test);
    }

    @Test
    public void testMethod() {
        AnnotationConfigApplicationContext configApplicationContext = new AnnotationConfigApplicationContext(AopConfig.class);
        DemoAnnotationService annotationService = configApplicationContext.getBean(DemoAnnotationService.class);
        annotationService.add();
        DemoMethodService demoMethodService = configApplicationContext.getBean(DemoMethodService.class);
        demoMethodService.add();
    }

    @Test
    public void testMethod2() {
        AnnotationConfigApplicationContext configApplicationContext = new AnnotationConfigApplicationContext(ScopeConfig.class);

        SingletomService singletomService = configApplicationContext.getBean(SingletomService.class);
        SingletomService singletomService_2 = configApplicationContext.getBean(SingletomService.class);
        System.out.println(singletomService == singletomService_2);
        ProtoTypeService protoTypeService = configApplicationContext.getBean(ProtoTypeService.class);
        ProtoTypeService protoTypeService_2 = configApplicationContext.getBean(ProtoTypeService.class);
        System.out.println(protoTypeService == protoTypeService_2);
    }

    /**
     * 测试Bean的初始化和销毁
     */
    @Test
    public void testMoethod3() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(PrePostConfig.class);
        BeanWayService beanWayService = applicationContext.getBean(BeanWayService.class);
        JSR250WayService jsr250WayService = applicationContext.getBean(JSR250WayService.class);
        applicationContext.close();
    }

    /**
     * 测试profile
     */
    @Test
    public void testMethod4() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.getEnvironment().setActiveProfiles("prod");
        context.register(ProfileConfig.class);
        context.refresh();

        DemoBean demoBean = context.getBean(DemoBean.class);
        System.out.println(demoBean.getContent());
        context.close();
    }

    /**
     * 事件监听
     */
    @Test
    public void testMethod5() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EventConfig.class);
        DemoPublisher demoPublisher = (DemoPublisher) context.getBean(DemoPublisher.class);
        demoPublisher.publish("test demo");
        context.close();
    }

    /**
     * SpringAware
     */
    @Test
    public void testMethod6() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AwareConfig.class);
        AwareService awareService = context.getBean(AwareService.class);
        awareService.getResult();
    }

    /**
     * 多线程
     */
    @Test
    public void testMethod7() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TaskExecutorConfig.class);
        AsyncTaskService service = (AsyncTaskService) context.getBean(AsyncTaskService.class);
        for (int i = 0; i < 10; i++) {
            service.executeAsynTask(i);
            service.executeAsynTask2(i);
        }
        context.close();
    }

    @Test
    public void testMethod8() throws InterruptedException {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ScheDuledTaskConfig.class);
        Thread.sleep(10000000);
    }
    @Test
    public void testMethod9(){
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ConditionConfig.class);
        ListService listService = context.getBean(ListService.class);
        System.out.println(context.getEnvironment().getProperty("os.name")+" 系统下的列表命令:"+listService.showListCmd());

    }

}
