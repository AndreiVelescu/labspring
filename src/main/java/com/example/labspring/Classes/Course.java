package com.example.labspring.Classes;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@RequiredArgsConstructor

public class Course {
    private String courseName;
    private String courseCode;
    private String department;
    private int creditHours;
    private final Professor professor;
}

