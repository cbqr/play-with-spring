package com.cbqr.springframework.beans.factory.support;

import com.cbqr.springframework.beans.BeansException;
import com.cbqr.springframework.beans.factory.config.BeanDefinition;

/**
 * 实现了 {@link AbstractBeanFactory#createBean(String, BeanDefinition)} 中的模板方法
 *
 * @author Dave Liu
 * @since 2022-05-13
 */
public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory {

    @Override
    protected Object createBean(String beanName, BeanDefinition beanDefinition) throws BeansException {
        Object bean = null;
        try {
            bean = beanDefinition.getBeanClass().newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            throw new BeansException("Instantiation of bean failed", e);
        }

        // 存放到单例对象的缓存中
        super.addSingleton(beanName, bean);
        return bean;
    }

}
