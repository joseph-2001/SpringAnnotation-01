package com.atguigu.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.atguigu.bean.Car;
import com.atguigu.bean.Color;
import com.atguigu.dao.BookDAO;

/**
 * 自动装配：
 *      Spring利用依赖注入（DI）,完成对IOC容器中各个组件的依赖关系赋值。
 *      
 * */
@Configuration
@ComponentScan({ "com.atguigu.controllor", "com.atguigu.dao", "com.atguigu.service", "com.atguigu.bean" })
public class MainConfigAutowire {
    @Bean
    @Primary
    public BookDAO bookDAO() {
        return new BookDAO();
    }

    @Bean
    //@Bean标注的方法创建对象的时候，方法参数的值从容器中获取
    public Color color(Car car) {
        Color color = new Color();
        color.setCar(car);
        return color;
    }
}
