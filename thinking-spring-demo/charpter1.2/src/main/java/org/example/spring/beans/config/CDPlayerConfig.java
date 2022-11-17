package org.example.spring.beans.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author lilongmin
 * @date 2022/11/16 22:39
 * @description
 */
@Configuration
//ComponentScan 默认扫描自己类所在包以及所有子包的bean
@ComponentScan(basePackages = "org.example.spring.beans")
public class CDPlayerConfig {
}
