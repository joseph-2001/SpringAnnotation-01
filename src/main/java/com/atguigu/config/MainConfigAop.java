package com.atguigu.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.atguigu.aop.LogAspects;
import com.atguigu.aop.MathCalculator;

@EnableAspectJAutoProxy
@Configuration
public class MainConfigAop {

    //业务逻辑类加入容器
    @Bean
    public MathCalculator mathCalculator() {
        return new MathCalculator();
    }

    //切面类加入容器
    @Bean
    public LogAspects logAspects() {
        return new LogAspects();
    }
}
