package org.example.spring1.q4;


import org.springframework.stereotype.Component;

@Component
public class Pen implements WritingTool {

    @Override
    public void write() {
        System.out.println("Writing using Pen");
    }
}
