package com.atguigu.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.atguigu.bean.Person;

//加载配置文件中的K/V值保存到环境变量中
//value可以写一个String数组，加载多个外部配置文件
@PropertySource(value = { "classpath:/person.properties" })
@Configuration
public class MainConfigProperyValues {

    @Bean
    public Person person() {
        return new Person();
    }
}
