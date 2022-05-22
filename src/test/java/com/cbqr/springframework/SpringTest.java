package com.cbqr.springframework;

import com.cbqr.springframework.bean.UserService;
import com.cbqr.springframework.context.support.ClassPathXmlApplicationContext;
import org.junit.Test;

/**
 * 对 Spring 容器进行测试
 *
 * @author Dave Liu
 * @since 2022-05-13
 */
public class SpringTest {

    @Test
    public void testXml() {
        // 1.初始化 BeanFactory
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring.xml");
        applicationContext.registerShutdownHook();

        // 2. 获取Bean对象调用方法
        UserService userService = applicationContext.getBean("userService", UserService.class);
        String result = userService.queryUserInfo();
        System.out.println("测试结果：" + result);

        System.out.println("ApplicationContextAware："+userService.getApplicationContext());
        System.out.println("BeanFactoryAware："+userService.getBeanFactory());
    }

}
