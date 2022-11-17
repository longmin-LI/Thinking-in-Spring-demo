package org.example.spring.beans.pojo;

/**
 * @author lilongmin
 * @date 2022/11/11 19:05
 * @description
 */
public class BraveKnight {

    private  Quest quest;

    public BraveKnight(Quest quest){
        this.quest = quest;
    }

    public void embarkOnQuest(){
        quest.embark();
    }
}
