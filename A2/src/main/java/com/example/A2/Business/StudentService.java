package com.example.A2.Business;

import com.example.A2.Persistence.Entity.Student;
import com.example.A2.Persistence.Repo.StudentRepository;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;

@Service
public class StudentService {
    @Inject
    StudentRepository studentRepository;

    public List<Student> getAllStudentssWithCourses()
    {
        return studentRepository.findAll();
    }

    public Student create(Student newStudent)
    {
        return studentRepository.save(newStudent);
    }

    public void update(Student newStudent, Student oldStudent){
        if(oldStudent == null){
            System.out.println("ERROR! Student does not exist !!!");
        } else{
            studentRepository.delete(oldStudent);
            studentRepository.save(newStudent);
        }
    }


    public void delete(Student student){
        studentRepository.delete(student);
    }
}
