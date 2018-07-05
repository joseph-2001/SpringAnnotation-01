package com.atguigu.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.EmbeddedValueResolverAware;
import org.springframework.stereotype.Component;
import org.springframework.util.StringValueResolver;

@Component
public class Red implements ApplicationContextAware, BeanNameAware, EmbeddedValueResolverAware {

    private ApplicationContext applicationContext;

    //传入ApplicationContext
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
        System.out.println("传入的IOC：" + this.applicationContext);
    }

    //传入当前Bean的名称
    public void setBeanName(String name) {
        System.out.println("当前Bean的名称：" + name);
    }

    //传入字符串解析器
    public void setEmbeddedValueResolver(StringValueResolver resolver) {
        String string = resolver.resolveStringValue("你好${os.name},我是#{20*18}");
        System.out.println(string);
    }

}
