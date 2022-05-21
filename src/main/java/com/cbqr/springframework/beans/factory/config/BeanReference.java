package com.cbqr.springframework.beans.factory.config;

/**
 * bean 的引用
 *
 * @author Dave Liu
 * @since 2022-05-21
 */
public class BeanReference {

    private final String beanName;

    public BeanReference(String beanName) {
        this.beanName = beanName;
    }

    public String getBeanName() {
        return beanName;
    }

}
