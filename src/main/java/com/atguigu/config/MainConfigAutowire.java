package com.atguigu.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.atguigu.dao.BookDAO;

/**
 * 自动装配：
 *      Spring利用依赖注入（DI）,完成对IOC容器中各个组件的依赖关系赋值。
 *      
 * */
@Configuration
@ComponentScan({ "com.atguigu.controllor", "com.atguigu.dao", "com.atguigu.service" })
public class MainConfigAutowire {
    @Bean
    @Primary
    public BookDAO bookDAO() {
        return new BookDAO();
    }
}
