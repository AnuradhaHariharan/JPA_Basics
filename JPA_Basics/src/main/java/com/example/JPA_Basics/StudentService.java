package com.example.JPA_Basics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class StudentService {
    @Autowired
    StudentRepository studentRepository;
    public String addStudent(Student student){
        studentRepository.save(student);
        return "Student Added Successfully";

    }
}
