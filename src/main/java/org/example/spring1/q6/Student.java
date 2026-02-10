package org.example.spring1.q6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {

    private final WritingTool tool;


    @Autowired
    public Student(WritingTool tool) {
        this.tool = tool;
    }

    public void display() {
        tool.write();
    }
}