package org.example.spring.aop.bootstrap;

import org.example.spring.aop.aspect.Audience;
import org.example.spring.aop.concert.DaivdTao;
import org.example.spring.aop.concert.Performance;
import org.example.spring.aop.config.ConcertConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import java.util.stream.Stream;

/**
 * @author lilongmin
 * @date 2022/11/8 14:59
 * @description
 */

//@Configuration
//@EnableAspectJAutoProxy
//@ComponentScan(basePackages = "org.example.spring.aop")
public class AopApplicationContext {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

        context.register(Audience.class, AopApplicationContext.class, ConcertConfig.class);

        context.refresh();

        String[] beanDefinitionNames = context.getBeanDefinitionNames();

        Stream.of(beanDefinitionNames).forEach(System.out::println);

        System.out.println(context.getBean("daivdTao").getClass());

        Performance bean = (Performance) context.getBean(Performance.class);
        bean.perform();
        context.close();
    }
}
