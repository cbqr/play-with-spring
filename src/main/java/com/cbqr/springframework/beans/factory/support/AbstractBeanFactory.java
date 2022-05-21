package com.cbqr.springframework.beans.factory.support;

import com.cbqr.springframework.beans.factory.BeanFactory;
import com.cbqr.springframework.beans.BeansException;
import com.cbqr.springframework.beans.factory.config.BeanDefinition;

/**
 * BeanDefinition注册表接口，抽象 BeanFactory，并定义模板方法。
 *
 * @author Dave Liu
 * @since 2022-05-13
 */
public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements BeanFactory {

    @Override
    public Object getBean(String beanName) throws BeansException {
        return doGetBean(beanName, null);
    }

    @Override
    public Object getBean(String beanName, Object... args) throws BeansException {
        return doGetBean(beanName, args);
    }

    @Override
    public <T> T getBean(String name, Class<T> requiredType) throws BeansException {
        return (T) getBean(name);
    }

    protected <T> T doGetBean(final String name, final Object[] args) {
        Object bean = getSingleton(name);
        if (bean != null) {
            return (T) bean;
        }

        BeanDefinition beanDefinition = getBeanDefinition(name);
        return (T) createBean(name, beanDefinition, args);
    }

    // === 设计模式：模板方法，子类提供具体实现 ===

    protected abstract BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    protected abstract Object createBean(String beanName, BeanDefinition beanDefinition, Object[] args) throws BeansException;

}
