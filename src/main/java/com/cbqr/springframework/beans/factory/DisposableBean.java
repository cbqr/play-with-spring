package com.cbqr.springframework.beans.factory;

/**
 * Interface to be implemented by beans that want to release resources
 * on destruction. A BeanFactory is supposed to invoke the destroy
 * method if it disposes a cached singleton. An application context
 * is supposed to dispose all of its singletons on close.
 *
 * @author Dave Liu
 * @since 2022-05-21
 */
public interface DisposableBean {

    void destroy() throws Exception;

}
