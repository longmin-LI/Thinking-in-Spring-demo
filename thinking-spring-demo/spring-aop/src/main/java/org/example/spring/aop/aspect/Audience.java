package org.example.spring.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author lilongmin
 * @date 2022/11/8 14:44
 * @description
 */
@Aspect
public class Audience {

    @Pointcut("execution(* *perform(..))")
    public void performance(){}

    @Before("performance()")
    public void beforeAdvice(){
        System.out.println("find the seat");
    }



}
