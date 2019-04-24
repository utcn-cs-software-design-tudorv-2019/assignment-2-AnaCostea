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

    public List<Student> getAllStudentsWithCourses()
    {
        return studentRepository.findAll();
    }

    public Student create(Student newStudent)
    {
        return studentRepository.save(newStudent);
    }

    public Student update(Student newStudent, Student oldStudent){
       /* if(oldStudent == null){
            System.out.println("ERROR! Student does not exist !!!");
        } else{*/
            newStudent.setId(oldStudent.getId());
            newStudent.setStudentName(newStudent.getStudentName());
            newStudent.setStudentGroup(newStudent.getStudentGroup());
            newStudent.setCourseName(newStudent.getCourseName());
            newStudent.setStudentGrades(newStudent.getStudentGrades());

        return studentRepository.save(newStudent);
    }


    public void delete(Student student){
        studentRepository.delete(student);
    }
}
