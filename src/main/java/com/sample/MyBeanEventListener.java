package com.sample;

import org.springframework.context.ApplicationListener;

public class MyBeanEventListener implements ApplicationListener<MyBeanEvent> {
    @Override
    public void onApplicationEvent(MyBeanEvent myBeanEvent) {
        System.out.println("MyBeanEvent is occured!!");
    }
}
