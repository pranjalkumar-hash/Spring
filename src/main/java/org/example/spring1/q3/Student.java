package org.example.spring1.q3;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {

    private WritingTool tool;

    @Autowired
    public Student(WritingTool tool) {
        this.tool = tool;
    }

    @PostConstruct
    public void start() {
        tool.write();
        System.out.println("Student started writing notes");
    }
}
