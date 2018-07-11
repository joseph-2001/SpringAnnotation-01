package com.atgugu.test;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.atguigu.tx.TxConfig;
import com.atguigu.tx.UserService;

public class TestIOCTx {

    private AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TxConfig.class);

    @Test
    public void test01() {

        UserService userService = (UserService) context.getBean("userService");
        userService.insertUser();
    }

}
