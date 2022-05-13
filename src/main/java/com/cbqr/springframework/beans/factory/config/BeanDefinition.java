package com.cbqr.springframework.beans.factory.config;

/**
 * 用于定义 Bean 实例化信息
 *
 * @author Dave Liu
 * @since 2022-05-13
 */
@SuppressWarnings("rawtypes")
public class BeanDefinition {

    private Class beanClass;

    public BeanDefinition(Class beanClass) {
        this.beanClass = beanClass;
    }

    public Class getBeanClass() {
        return beanClass;
    }

    public void setBeanClass(Class beanClass) {
        this.beanClass = beanClass;
    }

}
