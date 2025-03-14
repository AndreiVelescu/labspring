package com.example.labspring;
import com.example.labspring.Classes.Course;
import com.example.labspring.Classes.Professor;
import com.example.labspring.Classes.Student;
import com.example.labspring.service.CourseService;
import com.example.labspring.service.ProfessorService;
import com.example.labspring.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class StudentManagementApplication implements CommandLineRunner {

    @Autowired
    private CourseService courseService;
    @Autowired
    private ProfessorService professorService;
    @Autowired
    private StudentService studentService;


    public static void main(String[] args) {
        SpringApplication.run(StudentManagementApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        Course course = courseService.getCourse();
        Professor professor = professorService.getProfessor();
        Student student = context.getBean("student", Student.class);

        System.out.println("Course: " + course.getCourseName());
        System.out.println("Professor: " + professor.getName());
        System.out.println("Student: " + student.getName() + " Course: " + course.getCourseName());
    }
}
