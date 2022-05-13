package com.cbqr.springframework.beans.factory.support;

import com.cbqr.springframework.beans.factory.config.SingletonBeanRegistry;

import java.util.HashMap;
import java.util.Map;

/**
 * 单例注册接口的默认实现
 *
 * @author Dave Liu
 * @since 2022-05-13
 */
public class DefaultSingletonBeanRegistry implements SingletonBeanRegistry {

    private final Map<String, Object> singletonObjects = new HashMap<>();

    /**
     * 根据 BeanName 获取单例 bean 对象
     *
     * @param beanName beanName
     * @return 单例 bean 对象
     */
    @Override
    public Object getSingleton(String beanName) {
        return singletonObjects.get(beanName);
    }

    /**
     * 添加单例对象
     *
     * @param beanName beanName
     * @param singletonObject 单例对象
     */
    protected void addSingleton(String beanName, Object singletonObject) {
        singletonObjects.put(beanName, singletonObject);
    }

}
