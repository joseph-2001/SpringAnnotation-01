package com.atguigu.aop;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

//告诉Spring这个类是一个切面类
@Aspect
public class LogAspects {
    //抽取公共的切入点表达式
    //1.本类引用直接使用方法名
    //2.其它切面类引用使用方便全名
    @Pointcut("execution(public int com.atguigu.aop.MathCalculator.*(..))")
    public void pointCut() {

    }

    //@Before在目标方法之前切入 ，切入 点表达示指定在哪个方法切入
    @Before("pointCut()")
    public void logStart(JoinPoint joinpoint) {
        System.out
            .println(joinpoint.getSignature().getName() + "运行...参数列表为（" + Arrays.asList(joinpoint.getArgs()) + "）");
    }

    //joinPoint，织入点信息
    @After("com.atguigu.aop.LogAspects.pointCut()")
    public void logEnd(JoinPoint joinPoint) {
        System.out.println(joinPoint.getSignature().getName() + "结束");
    }

    //returning = "result"，result，返回值信息
    @AfterReturning(value = "pointCut()", returning = "result")
    public void logReturn(JoinPoint joinPoint, Object result) {
        System.out.println(joinPoint.getSignature().getName() + "正常返回，运行结果：" + result);
    }

    //throwing = "exception"，exception，异常信息
    @AfterThrowing(value = "pointCut()", throwing = "exception")
    public void logException(JoinPoint joinPoint, Exception exception) {
        System.out.println(joinPoint.getSignature().getName() + "运行异常，异常信息：" + exception.getMessage());
    }
}
