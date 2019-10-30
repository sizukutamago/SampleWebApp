package com.sample;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.sample")
public class MyBeanConfig {
    @Bean
    public MyBean myBean() {
        return new MyBean();
    }
}
