package com.cbqr.springframework.common;

import com.cbqr.springframework.beans.BeansException;
import com.cbqr.springframework.beans.PropertyValue;
import com.cbqr.springframework.beans.PropertyValues;
import com.cbqr.springframework.beans.factory.ConfigurableListableBeanFactory;
import com.cbqr.springframework.beans.factory.config.BeanDefinition;
import com.cbqr.springframework.beans.factory.config.BeanFactoryPostProcessor;

/**
 * MyBeanFactoryPostProcessor
 *
 * @author Dave Liu
 * @since 2022-05-21
 */
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        BeanDefinition beanDefinition = beanFactory.getBeanDefinition("userService");
        PropertyValues propertyValues = beanDefinition.getPropertyValues();

        propertyValues.addPropertyValue(new PropertyValue("company", "改为：字节跳动"));
    }

}
