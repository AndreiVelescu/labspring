package com.example.labspring.service;

import com.example.labspring.Classes.Professor;
import lombok.Getter;
import org.springframework.stereotype.Service;

@Getter
@Service
public class ProfessorService {
    private final Professor professor;

    public ProfessorService(Professor professor) {
        this.professor = professor;
    }
}
