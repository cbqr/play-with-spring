package com.cbqr.springframework.beans.factory.support;

import com.cbqr.springframework.beans.BeansException;
import com.cbqr.springframework.beans.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;

/**
 * Bean 实例化策略
 *
 * @author Dave Liu
 * @since 2022-05-20
 */
public interface InstantiationStrategy {

    Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor ctor, Object[] args) throws BeansException;

}
