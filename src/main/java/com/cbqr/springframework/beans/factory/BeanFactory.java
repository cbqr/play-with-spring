package com.cbqr.springframework.beans.factory;

import com.cbqr.springframework.beans.BeansException;

/**
 * Bean 对象工厂
 *
 * @author Dave Liu
 * @since 2022-05-13
 */
public interface BeanFactory {

    /**
     * 根据 BeanName 获取 Bean 定义信息
     *
     * @param beanName BeanName
     * @return Bean的实例化信息
     * @exception BeansException bean异常
     */
    Object getBean(String beanName) throws BeansException;

}
