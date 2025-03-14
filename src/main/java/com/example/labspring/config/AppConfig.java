package com.example.labspring.config;



import com.example.labspring.Classes.Course;
import com.example.labspring.Classes.Professor;
import com.example.labspring.Classes.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Professor professor() {
        return new Professor("Andriuha", 45, "andriuha@example.com", "Math", "Dr.");
    }
    @Bean
    public Course course(Professor professor) {
        return new Course("Math 101", "MTH101", "Math Department", 3, professor);
    }
    @Bean
    public Student student(Course course) {
        return new Student("Andr", 20, "andr@example.com", "Inf", 9, course);
    }
}

