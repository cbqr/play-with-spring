package com.cbqr.springframework.event;

import com.cbqr.springframework.context.ApplicationListener;
import com.cbqr.springframework.context.event.ContextClosedEvent;

/**
 * ContextClosedEventListener
 *
 * @author Dave Liu
 * @since 2022-05-23
 */
public class ContextClosedEventListener implements ApplicationListener<ContextClosedEvent> {

    @Override
    public void onApplicationEvent(ContextClosedEvent event) {
        System.out.println("关闭事件：" + this.getClass().getName());
    }

}
