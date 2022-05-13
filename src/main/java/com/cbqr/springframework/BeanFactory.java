package com.cbqr.springframework;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Bean 对象工厂
 *
 * @author Dave Liu
 * @since 2022-05-13
 */
public class BeanFactory {

    private Map<String, BeanDefinition> beanDefinitionMap = new ConcurrentHashMap<>();

    /**
     * 根据 BeanName 获取 Bean 定义信息
     *
     * @param beanName BeanName
     * @return Bean的实例化信息
     */
    public Object getBean(String beanName) {
        return beanDefinitionMap.get(beanName).getBean();
    }

    /**
     * Bean 的注册
     *
     * @param beanName BeanName
     * @param beanDefinition Bean的定义信息
     */
    public void registerBeanDefinition(String beanName, BeanDefinition beanDefinition) {
        beanDefinitionMap.put(beanName, beanDefinition);
    }

}
