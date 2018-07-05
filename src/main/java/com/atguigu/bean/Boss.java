package com.atguigu.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
//默认在IOC容器中的组件，容器启动会调用无参构造器创建对象，再进行初始化赋值等操作
public class Boss {
    private Car car;

    //@Autowired
    //构造器要自动注入的组件，也是从容器中获取
    //如果组件只有一个有参构造器，这个有参构造器的@Autowired可以省略
    public Boss(Car car) {
        this.car = car;
        System.out.println("Boss...有参构造器");
    }

    public Car getCar() {
        return car;
    }

    //@Autowired
    //标注在方法上时，Spring容器创建当前对象就对调用方法完成赋值
    //方法使用的参数，自定义类型的值从IOC窗口中获取
    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "Boss [car=" + car + "]";
    }

}
