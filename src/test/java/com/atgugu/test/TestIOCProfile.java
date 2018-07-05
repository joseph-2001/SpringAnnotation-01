package com.atgugu.test;

import javax.sql.DataSource;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.atguigu.config.MainConfigOfProfile;

public class TestIOCProfile {

    private AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
        MainConfigOfProfile.class);

    @Test
    public void test01() {
        String[] beanNamesForType = context.getBeanNamesForType(DataSource.class);
        for (String name : beanNamesForType) {
            System.out.println(name);

        }
    }

    @Test
    public void test02() {
        //1.创建一个applicationContext
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        //2.设置需要激活的环境
        applicationContext.getEnvironment().setActiveProfiles("iacp", "track");
        //3.注册主配置类
        applicationContext.register(MainConfigOfProfile.class);
        //4.启动刷新容器
        applicationContext.refresh();
        
        String[] beanNamesForType = applicationContext.getBeanNamesForType(DataSource.class);
        for (String name : beanNamesForType) {
            System.out.println(name);

        }

    }

    public void printBeans() {
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        for (String name : beanDefinitionNames) {
            System.out.println(name);
        }
    }
}
