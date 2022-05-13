package com.cbqr.springframework.beans.factory.support;

import com.cbqr.springframework.beans.factory.BeanFactory;
import com.cbqr.springframework.beans.BeansException;
import com.cbqr.springframework.beans.factory.config.BeanDefinition;

/**
 * 抽象 BeanFactory，并定义模板方法。
 * <p>继承了 {@link DefaultSingletonBeanRegistry}，也就是具备了使用单例注册类方法。</p>
 *
 * @author Dave Liu
 * @since 2022-05-13
 */
public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements BeanFactory {

    @Override
    public Object getBean(String beanName) throws BeansException {
        Object bean = super.getSingleton(beanName);
        if (bean != null) {
            return bean;
        }

        BeanDefinition beanDefinition = this.getBeanDefinition(beanName);
        return this.createBean(beanName, beanDefinition);
    }

    // === 设计模式：模板方法，子类提供具体实现 ===

    protected abstract Object createBean(String beanName, BeanDefinition beanDefinition) throws BeansException;

    protected abstract BeanDefinition getBeanDefinition(String beanName) throws BeansException;

}
