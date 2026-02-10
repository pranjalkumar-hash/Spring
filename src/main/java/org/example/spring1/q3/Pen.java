package org.example.spring1.q3;

import org.springframework.stereotype.Component;

@Component
public class Pen implements WritingTool {

    @Override
    public void write() {
        System.out.println("Writing with a pen");
    }
}
