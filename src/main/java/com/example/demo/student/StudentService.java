package com.example.demo.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    public List<Student> getStudents(){
        Student student1=new Student(1,"Sun");
        Student student2=new Student(2,"John");
        Student student3=new Student(3,"Smith");
        Student student4=new Student(4,"Zoe");
        Student student5=new Student(5,"Mike");
        Student student6=new Student(6,"Bush");
        List<Student> re = new ArrayList<>();
        re.add(student1);
        re.add(student2);
        re.add(student3);
        re.add(student4);
        re.add(student5);
        re.add(student6);
        return re;
    }
}
