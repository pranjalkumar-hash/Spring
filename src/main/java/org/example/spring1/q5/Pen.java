package org.example.spring1.q5;



import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Pen implements WritingTool {

    @Override
    public void write() {
        System.out.println("Writing using Pen");
    }
}
