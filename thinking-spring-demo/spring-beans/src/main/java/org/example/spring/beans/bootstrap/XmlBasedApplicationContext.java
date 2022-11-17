package org.example.spring.beans.bootstrap;

import org.example.spring.beans.pojo.BraveKnight;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author lilongmin
 * @date 2022/11/12 13:18
 * @description
 */
public class XmlBasedApplicationContext {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("META-INF/applicationcontext.xml");
        BraveKnight knight = applicationContext.getBean(BraveKnight.class);
        knight.embarkOnQuest();
        applicationContext.close();
    }
}
