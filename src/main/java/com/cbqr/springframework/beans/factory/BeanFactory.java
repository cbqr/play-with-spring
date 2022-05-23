package com.cbqr.springframework.beans.factory;

import com.cbqr.springframework.beans.BeansException;

/**
 * Bean 对象工厂
 *
 * @author Dave Liu
 * @since 2022-05-13
 */
public interface BeanFactory {

    Object getBean(String beanName) throws BeansException;

    Object getBean(String beanName, Object... args) throws BeansException;

    <T> T getBean(String name, Class<T> requiredType) throws BeansException;

}
