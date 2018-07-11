package com.atgugu.test;

import org.junit.Test;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.atguigu.ext.ExtConfig;

public class TestIOCExt {

    @Test
    public void test01() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ExtConfig.class);
        context.publishEvent(new ApplicationEvent(new String("我发布的事件")) {
            private static final long serialVersionUID = 3183490866848073049L;
        });
        context.close();
    }

}
