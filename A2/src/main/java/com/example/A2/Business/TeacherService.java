package com.example.A2.Business;


import com.example.A2.Persistence.Entity.Teacher;
import com.example.A2.Persistence.Repo.TeacherRepository;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;


@Service
public class TeacherService {
    private int count;

    @Inject
    TeacherRepository teacherRepository;

    public List<Teacher> getAllTeachersWithCourses()
    {
        return teacherRepository.findAll();
    }

    public Teacher create(Teacher newTeacher)
    {
        return teacherRepository.save(newTeacher);
    }
}
