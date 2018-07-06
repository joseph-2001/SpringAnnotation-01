package com.atgugu.test;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.atguigu.aop.MathCalculator;
import com.atguigu.config.MainConfigAop;

public class TestIOCAop {

    private AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfigAop.class);

    @Test
    public void test01() {

        MathCalculator mathCalculator = (MathCalculator) context.getBean("mathCalculator");
        mathCalculator.div(90, 0);
    }

}
