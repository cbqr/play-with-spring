package com.cbqr.springframework.beans;

/**
 * bean 属性信息
 *
 * @author Dave Liu
 * @since 2022-05-21
 */
public class PropertyValue {

    private final String name;

    private final Object value;

    public PropertyValue(String name, Object value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public Object getValue() {
        return value;
    }

}
