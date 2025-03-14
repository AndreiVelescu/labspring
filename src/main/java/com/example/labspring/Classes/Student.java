package com.example.labspring.Classes;

import java.util.Objects;

public class Student {
    private String name;
    private int age;
    private String email;
    private String department;
    private double grade;


    public Student() {}


    public Student(String name, int age, String email, String department, double grade) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.department = department;
        this.grade = grade;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    // ToString
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", department='" + department + '\'' +
                ", grade=" + grade +
                '}';
    }

    // equals si hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age &&
                Double.compare(student.grade, grade) == 0 &&
                Objects.equals(name, student.name) &&
                Objects.equals(email, student.email) &&
                Objects.equals(department, student.department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, email, department, grade);
    }
}

