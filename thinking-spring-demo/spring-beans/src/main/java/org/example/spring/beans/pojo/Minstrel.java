package org.example.spring.beans.pojo;

import java.io.PrintStream;

/**
 * @author lilongmin
 * @date 2022/11/12 14:09
 * @description
 */
public class Minstrel {

    private PrintStream stream;

    public Minstrel(PrintStream stream){
        this.stream = stream;
    }

    public void singBeforeEmbark(){
        System.out.println("long ge jiu shi long");
    }

    public void singAfterEmbark(){
        System.out.println("re a!");
    }
}
