package com.atgugu.test;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.atguigu.config.MainConfigOfLiftCycle;

public class TestIOCLiftCycle {

    @Test
    public void test01() {
        //创建窗口
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MainConfigOfLiftCycle.class);

        System.out.println("容器创建完成");

        //关闭容器
        ctx.close();
    }
}
