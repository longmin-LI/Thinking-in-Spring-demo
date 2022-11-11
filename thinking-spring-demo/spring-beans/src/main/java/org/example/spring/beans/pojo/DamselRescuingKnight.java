package org.example.spring.beans.pojo;

/**
 * 耦合在一起的代码示例，这样对于这个骑士来说，他只能救公主，而不能干其他的请求
 * 代码耦合带来的坏处就体现出来了，而且不好测试这个骑士类。
 * {@link Quest}
 * @author lilongmin
 * @date 2022/11/11 18:46
 * @description
 */
public class DamselRescuingKnight {

    private RescueDamselQuest quest;

    public DamselRescuingKnight(){
        this.quest = new RescueDamselQuest();
    }

    public void embarkOnQuest(){
        quest.embark();
    }

}
