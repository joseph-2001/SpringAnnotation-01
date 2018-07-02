package com.atguigu.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * 后置处理器，初始化前后进行处理工作
 * 将后置处理器加入到Spring容器中，就可以工作了
 * */
@Component
public class MyBeanPostProcessor implements BeanPostProcessor {

    /**
     * @param bean:当前管理初始化的Bean
     * @param beanName：当前管理初始化的类名
     * @return 原始的Bean或是包装后的Bean
     * */
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessBeforeInitialization..." + beanName + "=>" + bean);
        return bean;
    }

    /**
     * @param bean:当前管理初始化的Bean
     * @param beanName：当前管理初始化的类名
     * @return 原始的Bean或是包装后的Bean
     * */
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessAfterInitialization..." + beanName + "=>" + bean);
        return bean;
    }

}
