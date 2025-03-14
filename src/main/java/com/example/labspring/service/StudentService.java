package com.example.labspring.service;

import com.example.labspring.Classes.Professor;
import com.example.labspring.Classes.Student;
import lombok.Getter;
import org.springframework.stereotype.Service;
@Getter
@Service

public class StudentService {

    private final Student student;

    public StudentService(Student student) {
        this.student = student;
    }
}
