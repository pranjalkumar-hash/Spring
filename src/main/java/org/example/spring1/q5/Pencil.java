package org.example.spring1.q5;



import org.springframework.stereotype.Component;

@Component
public class Pencil implements WritingTool {

    @Override
    public void write() {
        System.out.println("Writing with a pencil");
    }
}