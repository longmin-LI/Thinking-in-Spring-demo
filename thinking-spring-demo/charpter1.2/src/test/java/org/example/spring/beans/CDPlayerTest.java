package org.example.spring.beans;

import org.example.spring.beans.config.CDPlayerConfig;
import org.example.spring.beans.pojo.CompactDisc;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotNull;

/**
 * 测试componentScan生效，已经将标记了Component注解的类作为bean
 * @author lilongmin
 * @date 2022/11/16 22:51
 * @description
 */
//一个是为了方便从spring容器中取得对象，下面一个注解是指定spring的配置文件
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerConfig.class)
public class CDPlayerTest {

    @Autowired
    CompactDisc compactDisc;

    @Test
    public void test(){
        compactDisc.play();
        assertNotNull(compactDisc);
    }

}
