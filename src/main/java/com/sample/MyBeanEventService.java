package com.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

public class MyBeanEventService implements ApplicationEventPublisherAware {
    @Autowired
    private MyBean mybean;

    private ApplicationEventPublisher publisherAware;

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.publisherAware = applicationEventPublisher;
        System.out.println("setApplicationEventPublisher");
    }

    public void doService(String message) {
        System.out.println("doService!");

        mybean.addMessage(message);
        publisherAware.publishEvent(new MyBeanEvent(this));
    }
}
