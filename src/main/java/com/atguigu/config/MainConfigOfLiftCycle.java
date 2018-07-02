package com.atguigu.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.atguigu.bean.Car;

@Configuration
@ComponentScan(value = "com.atguigu.bean")
public class MainConfigOfLiftCycle {

    //initMethod指定初始化方法，destroyMethod指定销毁方法
    @Bean(initMethod = "init", destroyMethod = "destory")
    public Car car() {
        return new Car();
    }
}
