package com.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.sample")
public class MyBeanConfig2 {
    @Autowired
    private MyBeanConfig config;

    @Bean
    public MyBean2 myBean2(){
        return new MyBean2();
    }

    @Bean
    public MySampleApplicationListener applicationListener() {
        return new MySampleApplicationListener();
    }
}
