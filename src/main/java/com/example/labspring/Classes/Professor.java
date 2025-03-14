package com.example.labspring.Classes;

import java.util.Objects;

public class Professor {
    private String name;
    private int age;
    private String email;
    private String department;
    private String title;


    public Professor() {}


    public Professor(String name, int age, String email, String department, String title) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.department = department;
        this.title = title;
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    @Override
    public String toString() {
        return "Professor{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", department='" + department + '\'' +
                ", title='" + title + '\'' +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Professor professor = (Professor) o;
        return age == professor.age &&
                Objects.equals(name, professor.name) &&
                Objects.equals(email, professor.email) &&
                Objects.equals(department, professor.department) &&
                Objects.equals(title, professor.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, email, department, title);
    }
}

