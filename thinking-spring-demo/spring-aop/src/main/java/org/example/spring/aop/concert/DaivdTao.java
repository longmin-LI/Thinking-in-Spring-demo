package org.example.spring.aop.concert;

import org.springframework.stereotype.Component;

/**
 * @author lilongmin
 * @date 2022/11/8 14:51
 * @description
 */
public class DaivdTao implements Performance{

    @Override
    public void perform() {
        System.out.println("melody");
    }
}
