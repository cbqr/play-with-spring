package com.cbqr.springframework.context;

import com.cbqr.springframework.beans.BeansException;

/**
 * SPI interface to be implemented by most if not all application contexts.
 * Provides facilities to configure an application context in addition
 * to the application context client methods in the
 * {@link com.cbqr.springframework.context.ApplicationContext} interface.
 *
 * @author Dave Liu
 * @since 2022-05-21
 */
public interface ConfigurableApplicationContext extends ApplicationContext {

    /**
     * 刷新容器
     *
     * @throws BeansException
     */
    void refresh() throws BeansException;

}
