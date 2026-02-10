package org.example.spring1.q2;

public class Student {

    private WritingTool tool;


    public Student(WritingTool tool) {
        this.tool = tool;
    }

    public void startWriting() {
        tool.write();
        System.out.println("Student is writing notes");
    }
}
