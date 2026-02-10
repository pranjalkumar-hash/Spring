package org.example.spring1.q4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {

    private int id;
    private String name;
    private WritingTool tool;

    @Autowired
    public Student(WritingTool tool) {
        this.id = 101;
        this.name = "Pranjal";
        this.tool = tool;
    }

    public void displayDetails() {
        System.out.println("Student Id   : " + id);
        System.out.println("Student Name : " + name);
        tool.write();
    }
}
