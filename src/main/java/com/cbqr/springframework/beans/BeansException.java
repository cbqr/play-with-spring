package com.cbqr.springframework.beans;

/**
 * 定义 Bean 异常
 *
 * @author Dave Liu
 * @since 2022-05-13
 */
public class BeansException extends RuntimeException {

    public BeansException(String message) {
        super(message);
    }

    public BeansException(String message, Throwable cause) {
        super(message, cause);
    }

}
