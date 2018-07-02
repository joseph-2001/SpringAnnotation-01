package com.atguigu.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class Cat implements InitializingBean, DisposableBean {
    public Cat() {
        System.out.println("cat constructor ...");
    }

    //销毁方法
    public void destroy() throws Exception {
        System.out.println("cat destroy ...");

    }

    //在Bean属性全部设置完成后方法
    public void afterPropertiesSet() throws Exception {
        System.out.println("cat afterPropertiesSet ...");

    }
}
