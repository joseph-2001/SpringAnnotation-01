package com.atgugu.test;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.atguigu.bean.Person;
import com.atguigu.config.MainConfig;

public class TestIOC {
    private AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);

    private void printBeans() {
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        for (String name : beanDefinitionNames) {
            System.out.println(name);
        }
    }

    @Test
    public void test() {
        //printBeans();
        Person person = (Person) context.getBean("person");
        System.out.println(person);

    }
}
