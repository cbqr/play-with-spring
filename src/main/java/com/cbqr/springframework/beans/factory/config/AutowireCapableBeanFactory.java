package com.cbqr.springframework.beans.factory.config;

import com.cbqr.springframework.beans.factory.BeanFactory;

/**
 * Extension of the {@link BeanFactory}
 * interface to be implemented by bean factories that are capable of
 * autowiring, provided that they want to expose this functionality for
 * existing bean instances.
 *
 * @author Dave Liu
 * @since 2022-05-21
 */
public interface AutowireCapableBeanFactory extends BeanFactory {
}
