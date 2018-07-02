package com.atgugu.test;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

import com.atguigu.bean.Person;
import com.atguigu.config.MainConfig;
import com.atguigu.config.MainConfigOfLiftCycle;
import com.atguigu.config.MainConfigProperyValues;

public class TestIOCPropertyValue {

    private AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
        MainConfigProperyValues.class);

    @Test
    public void test01() {
        printBeans();
        Person person = (Person) context.getBean("person");
        System.out.println(person);

        ConfigurableEnvironment environment = context.getEnvironment();
        System.out.println(environment.getProperty("person.nickname"));

        context.close();
    }

    private void printBeans() {
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        for (String name : beanDefinitionNames) {
            System.out.println(name);
        }
    }
}
