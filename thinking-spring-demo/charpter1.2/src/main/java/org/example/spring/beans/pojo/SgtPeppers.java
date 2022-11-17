package org.example.spring.beans.pojo;

import org.springframework.stereotype.Component;

/**
 * @author lilongmin
 * @date 2022/11/16 22:33
 * @description
 */
@Component
public class SgtPeppers implements CompactDisc{
    private String title = "lee cheer fuck lee kai";
    private String author = "lee cheer";

    @Override
    public void play() {
        System.out.println("playing " + title + " by " + author);
    }
}
