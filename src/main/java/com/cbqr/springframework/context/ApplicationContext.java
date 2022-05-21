package com.cbqr.springframework.context;

import com.cbqr.springframework.beans.factory.ListableBeanFactory;

/**
 * Central interface to provide configuration for an application.
 * This is read-only while the application is running, but may be
 * reloaded if the implementation supports this.
 *
 * 应用上下文
 *
 * @author Dave Liu
 * @since 2022-05-21
 */
public interface ApplicationContext extends ListableBeanFactory {



}
