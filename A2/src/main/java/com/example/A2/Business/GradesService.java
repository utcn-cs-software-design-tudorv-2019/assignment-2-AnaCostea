package com.example.A2.Business;

import com.example.A2.Persistence.Entity.Grades;
import com.example.A2.Persistence.Repo.GradesRepository;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;

@Service
public class GradesService {
    @Inject
    GradesRepository gradesRepository;

    public List<Grades> getAllStudentsGrades()
    {
        return gradesRepository.findAll();
    }

    public Grades create(Grades newGrade)
    {
        return gradesRepository.save(newGrade);
    }

    public void delete(Grades grade){
        gradesRepository.delete(grade);
    }

}
