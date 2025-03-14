package com.example.labspring.Classes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data

@AllArgsConstructor
@RequiredArgsConstructor

public class Student {
    private String name;
    private int age;
    private String email;
    private String department;
    private double grade;

    private final Course course;

}



