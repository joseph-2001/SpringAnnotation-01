package com.atguigu.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class Dog implements ApplicationContextAware {

    private ApplicationContext applicationContext;

    public Dog() {
        System.out.println("Dog constructor...");
    }

    @PostConstruct
    public void init() {
        System.out.println("Dog @PostConstruct ...");
    }

    @PreDestroy
    public void destory() {
        System.out.println("Dog @PreDestroy ...");
    }

    public void setApplicationContext(ApplicationContext arg0) throws BeansException {
        this.applicationContext = arg0;
    }
}
