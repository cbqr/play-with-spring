package com.cbqr.springframework.event;

import com.cbqr.springframework.context.ApplicationListener;
import com.cbqr.springframework.context.event.ContextRefreshedEvent;

/**
 * ContextRefreshedEventListener
 *
 * @author Dave Liu
 * @since 2022-05-23
 */
public class ContextRefreshedEventListener implements ApplicationListener<ContextRefreshedEvent> {

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        System.out.println("刷新事件：" + this.getClass().getName());
    }

}
