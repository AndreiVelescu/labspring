package com.example.labspring.service;


import com.example.labspring.Classes.Course;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Getter
@Service
public class CourseService {

    private final Course course;


    @Autowired
    public CourseService(Course course) {
        this.course = course;

    }
}

