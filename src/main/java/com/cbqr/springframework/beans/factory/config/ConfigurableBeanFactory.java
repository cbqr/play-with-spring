package com.cbqr.springframework.beans.factory.config;

import com.cbqr.springframework.beans.factory.BeanFactory;

/**
 * Configuration interface to be implemented by most bean factories. Provides
 * facilities to configure a bean factory, in addition to the bean factory
 * client methods in the {@link BeanFactory}
 * interface.
 *
 * @author Dave Liu
 * @since 2022-05-21
 */
public interface ConfigurableBeanFactory {

    String SCOPE_SINGLETON = "singleton";

    String SCOPE_PROTOTYPE = "prototype";

}
