package com.atgugu.test;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.atguigu.bean.Boss;
import com.atguigu.bean.Car;
import com.atguigu.bean.Color;
import com.atguigu.config.MainConfigAutowire;
import com.atguigu.dao.BookDAO;
import com.atguigu.service.BookService;

public class TestIOCAutowired {

    private AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
        MainConfigAutowire.class);

    @Test
    public void test01() {
        //printBeans();
        //        BookService bookService = context.getBean(BookService.class);
        //        bookService.print();
        //        BookDAO bookDAO = context.getBean(BookDAO.class);
        Boss boss = (Boss) context.getBean("boss");
        System.out.println(boss);
        Car car = (Car) context.getBean("car");
        System.out.println(car);
        Color color = (Color) context.getBean("color");
        System.out.println(color);
    }

    public void printBeans() {
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        for (String name : beanDefinitionNames) {
            System.out.println(name);
        }
    }
}
