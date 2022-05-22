package com.cbqr.springframework.context.support;

import com.cbqr.springframework.beans.BeansException;
import com.cbqr.springframework.beans.factory.config.BeanPostProcessor;
import com.cbqr.springframework.context.ApplicationContext;
import com.cbqr.springframework.context.ApplicationContextAware;

/**
 * ApplicationContextAwareProcessor
 *
 * @author Dave Liu
 * @since 2022-05-22
 */
public class ApplicationContextAwareProcessor implements BeanPostProcessor {

    private final ApplicationContext applicationContext;

    public ApplicationContextAwareProcessor(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof ApplicationContextAware){
            ((ApplicationContextAware) bean).setApplicationContext(applicationContext);
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }

}
