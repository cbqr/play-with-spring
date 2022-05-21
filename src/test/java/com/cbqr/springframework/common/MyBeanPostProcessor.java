package com.cbqr.springframework.common;

import com.cbqr.springframework.bean.UserService;
import com.cbqr.springframework.beans.BeansException;
import com.cbqr.springframework.beans.factory.config.BeanPostProcessor;

/**
 * MyBeanPostProcessor
 *
 * @author Dave Liu
 * @since 2022-05-21
 */
public class MyBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if ("userService".equals(beanName)) {
            UserService userService = (UserService) bean;
            userService.setLocation("改为：北京");
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }

}
