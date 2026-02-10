package org.example.spring1.q2;

public class LooseCouplingDemo {
    public static void main(String[] args) {

        WritingTool pen = new Pen();
        // WritingTool pencil = new Pencil();

        Student student = new Student(pen);
        student.startWriting();
    }
}
