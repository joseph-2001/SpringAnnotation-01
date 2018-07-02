package com.atgugu.test;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

import com.atguigu.bean.Person;
import com.atguigu.config.MainConfig;
import com.atguigu.config.MainConfigAutowire;
import com.atguigu.config.MainConfigOfLiftCycle;
import com.atguigu.config.MainConfigProperyValues;
import com.atguigu.dao.BookDAO;
import com.atguigu.service.BookService;

public class TestIOCAutowired {

    private AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
        MainConfigAutowire.class);

    @Test
    public void test01() {
        //printBeans();
        BookService bookService = context.getBean(BookService.class);
        bookService.print();
        BookDAO bookDAO = context.getBean(BookDAO.class);
        System.out.println(bookDAO);
    }

    public void printBeans() {
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        for (String name : beanDefinitionNames) {
            System.out.println(name);
        }
    }
}
