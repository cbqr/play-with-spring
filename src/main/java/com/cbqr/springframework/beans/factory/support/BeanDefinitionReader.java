package com.cbqr.springframework.beans.factory.support;

import com.cbqr.springframework.beans.BeansException;
import com.cbqr.springframework.core.io.Resource;
import com.cbqr.springframework.core.io.ResourceLoader;

/**
 * Simple interface for bean definition readers.
 *
 * @author Dave Liu
 * @since 2022-05-21
 */
public interface BeanDefinitionReader {

    BeanDefinitionRegistry getRegistry();

    ResourceLoader getResourceLoader();

    void loadBeanDefinitions(Resource resource) throws BeansException;

    void loadBeanDefinitions(Resource... resources) throws BeansException;

    void loadBeanDefinitions(String location) throws BeansException;

}
