package org.example.spring1.q4;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Spring1Application {

    public static void main(String[] args) {

        ApplicationContext context =
                SpringApplication.run(Spring1Application.class, args);

        Student student = context.getBean(Student.class);
        student.displayDetails();
    }
}
