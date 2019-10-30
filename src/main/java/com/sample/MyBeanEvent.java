package com.sample;

import org.springframework.context.ApplicationEvent;

public class MyBeanEvent extends ApplicationEvent {

    public MyBeanEvent(Object source) {
        super(source);
        System.out.println("create MyBeanEvent!");
    }
}
