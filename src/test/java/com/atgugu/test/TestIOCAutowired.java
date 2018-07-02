package com.atgugu.test;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.atguigu.config.MainConfigAutowire;
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
