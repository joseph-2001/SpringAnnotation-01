package com.atguigu.ext;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.atguigu.bean.Blue;

@Configuration
@ComponentScan("com.atguigu.ext")
public class ExtConfig {
    @Bean
    public Blue blue() {
        return new Blue();
    }
}
