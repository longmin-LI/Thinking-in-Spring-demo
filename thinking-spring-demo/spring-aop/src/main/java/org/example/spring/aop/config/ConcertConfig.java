package org.example.spring.aop.config;

import org.aspectj.lang.annotation.Aspect;
import org.example.spring.aop.aspect.Audience;
import org.example.spring.aop.concert.DaivdTao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author lilongmin
 * @date 2022/11/8 14:57
 * @description
 */
@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages = "org.example.spring.aop")
public class ConcertConfig {

    @Bean
    public Audience audience(){
        return new Audience();
    }

    @Bean
    public DaivdTao daivdTao(){
        return new DaivdTao();
    }

}
