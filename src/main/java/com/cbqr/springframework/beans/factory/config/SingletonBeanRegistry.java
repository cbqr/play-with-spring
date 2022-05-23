package com.cbqr.springframework.beans.factory.config;

/**
 * 单例注册接口
 *
 * @author Dave Liu
 * @since 2022-05-13
 */
public interface SingletonBeanRegistry {

    /**
     * 根据 BeanName 获取单例对象
     *
     * @param beanName BeanName
     * @return 单例对象
     */
    Object getSingleton(String beanName);

    void registerSingleton(String beanName, Object singletonObject);

}
