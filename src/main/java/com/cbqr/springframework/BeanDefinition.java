package com.cbqr.springframework;

/**
 * 用于定义 Bean 实例化信息
 *
 * @author Dave Liu
 * @since 2022-05-13
 */
public class BeanDefinition {

    private Object bean;

    public BeanDefinition(Object bean) {
        this.bean = bean;
    }

    public Object getBean() {
        return bean;
    }

}
