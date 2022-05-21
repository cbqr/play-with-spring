package com.cbqr.springframework.beans.factory.support;

import com.cbqr.springframework.beans.BeansException;
import com.cbqr.springframework.beans.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * JDK 实例化
 *
 * @author Dave Liu
 * @since 2022-05-20
 */
public class SimpleInstantiationStrategy implements InstantiationStrategy {

    @Override
    public Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor ctor, Object[] args) throws BeansException {
        // 通过BeanDefinition获取Class信息，这个Class信息是在Bean定义的时候传递进去的
        Class clazz = beanDefinition.getBeanClass();
        try {
            // 判断ctor是否为空，如果为空则是无构造函数实例化，否则就是需要有构造函数的实例化
            if (null != ctor) {
                return clazz.getDeclaredConstructor(ctor.getParameterTypes()).newInstance(args);
            } else {
                return clazz.getDeclaredConstructor().newInstance();
            }
        } catch (NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
            throw new BeansException("Failed to instantiate [" + clazz.getName() + "]", e);
        }
    }

}
