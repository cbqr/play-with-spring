package com.cbqr.springframework;

import com.cbqr.springframework.bean.UserDao;
import com.cbqr.springframework.bean.UserService;
import com.cbqr.springframework.beans.PropertyValue;
import com.cbqr.springframework.beans.PropertyValues;
import com.cbqr.springframework.beans.factory.config.BeanDefinition;
import com.cbqr.springframework.beans.factory.config.BeanReference;
import com.cbqr.springframework.beans.factory.support.DefaultListableBeanFactory;
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
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        // UserDao 注册
        beanFactory.registerBeanDefinition("userDao", new BeanDefinition(UserDao.class));

        // UserService 设置属性[uId、userDao]
        PropertyValues propertyValues = new PropertyValues();
        propertyValues.addPropertyValue(new PropertyValue("uId", "10001"));
        propertyValues.addPropertyValue(new PropertyValue("userDao",new BeanReference("userDao")));

        // UserService 注入bean
        BeanDefinition beanDefinition = new BeanDefinition(UserService.class, propertyValues);
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        // UserService 获取bean
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();
    }

}
