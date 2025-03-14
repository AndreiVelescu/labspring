package com.example.labspring.Classes;

import java.util.Objects;

public class Course {
    private String courseName;
    private String courseCode;
    private String department;
    private int creditHours;
    private String professorName;


    public Course() {}


    public Course(String courseName, String courseCode, String department, int creditHours, String professorName) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.department = department;
        this.creditHours = creditHours;
        this.professorName = professorName;
    }


    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getCreditHours() {
        return creditHours;
    }

    public void setCreditHours(int creditHours) {
        this.creditHours = creditHours;
    }

    public String getProfessorName() {
        return professorName;
    }

    public void setProfessorName(String professorName) {
        this.professorName = professorName;
    }


    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", courseCode='" + courseCode + '\'' +
                ", department='" + department + '\'' +
                ", creditHours=" + creditHours +
                ", professorName='" + professorName + '\'' +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return creditHours == course.creditHours &&
                Objects.equals(courseName, course.courseName) &&
                Objects.equals(courseCode, course.courseCode) &&
                Objects.equals(department, course.department) &&
                Objects.equals(professorName, course.professorName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(courseName, courseCode, department, creditHours, professorName);
    }
}

