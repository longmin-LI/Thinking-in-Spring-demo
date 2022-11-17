package org.example.spring.beans.pojo;

import org.junit.Test;

import static org.mockito.Mockito.*;

/**
 * 测试类
 * @author lilongmin
 * @date 2022/11/12 12:31
 * @description
 */
public class KnightTest {

    @Test
    public void knightShouldEmbarkOn(){
        Quest quest = mock(RescueDamselQuest.class);
        BraveKnight braveKnight = new BraveKnight(quest);
        braveKnight.embarkOnQuest();
        //测试方法的调用次数
        verify(quest, times(1)).embark();
    }
}
