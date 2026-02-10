package org.example.spring1.q1;

public class Student {
    private Pen pen = new Pen();

    public void startWriting() {
        pen.write();
        System.out.println("Student is writing notes");
    }
}
