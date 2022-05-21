package com.cbqr.springframework.context.support;

import com.cbqr.springframework.beans.factory.support.DefaultListableBeanFactory;
import com.cbqr.springframework.beans.factory.xml.XmlBeanDefinitionReader;

/**
 * Convenient base class for {@link com.cbqr.springframework.context.ApplicationContext}
 * implementations, drawing configuration from XML documents containing bean definitions
 * understood by an {@link com.cbqr.springframework.beans.factory.xml.XmlBeanDefinitionReader}.
 *
 * @author Dave Liu
 * @since 2022-05-21
 */
public abstract class AbstractXmlApplicationContext extends AbstractRefreshableApplicationContext {

    @Override
    protected void loadBeanDefinitions(DefaultListableBeanFactory beanFactory) {
        XmlBeanDefinitionReader beanDefinitionReader = new XmlBeanDefinitionReader(beanFactory, this);
        String[] configLocations = getConfigLocations();
        if (null != configLocations){
            beanDefinitionReader.loadBeanDefinitions(configLocations);
        }
    }

    protected abstract String[] getConfigLocations();

}
