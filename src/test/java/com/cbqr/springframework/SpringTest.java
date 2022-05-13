package com.cbqr.springframework;

import com.cbqr.springframework.bean.UserService;
import org.junit.Test;

/**
 * 对 Spring 容器进行测试
 *
 * @author Dave Liu
 * @since 2022-05-13
 */
public class SpringTest {

    @Test
    public void testBeanFactory() {
        // 初始化 BeanFactory
        BeanFactory beanFactory = new BeanFactory();

        // 注册 bean
        BeanDefinition beanDefinition = new BeanDefinition(new UserService());
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        // 获取 bean
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();
    }

}
