package com.cbqr.springframework.context.event;

import com.cbqr.springframework.context.ApplicationEvent;

/**
 * Event raised when an <code>ApplicationContext</code> gets closed.
 *
 * @author Dave Liu
 * @since 2022-05-22
 */
public class ContextClosedEvent extends ApplicationEvent {

    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public ContextClosedEvent(Object source) {
        super(source);
    }

}
