package org.example.spring.beans.pojo;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author lilongmin
 * @date 2022/11/17 20:41
 * @description
 */
public class CDPlayer implements MediaPlayer{
    private CompactDisc compactDisc;

    @Autowired
    public CDPlayer(CompactDisc compactDisc){
        this.compactDisc = compactDisc;
    }

    @Override
    public void play() {

    }
}
