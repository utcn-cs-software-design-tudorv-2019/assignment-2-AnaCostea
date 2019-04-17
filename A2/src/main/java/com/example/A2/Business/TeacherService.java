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
   /* public TeacherService(TeacherRepository teacherRepository) {
        this.teacherRepository=teacherRepository;
    }*/

    public List<Teacher> getAllTeachersWithCourses()
    {
        return teacherRepository.findAll();
    }

    public void create(Teacher newTeacher)
    {
        System.out.println("HERE!"+newTeacher);
        teacherRepository.save(newTeacher);
    }

    public void update( Teacher newTeacher, Teacher oldTeacher){
       if(oldTeacher == null){
           System.out.println("ERROR! Teacher does not exist !!!");
       } else{
           teacherRepository.delete(oldTeacher);
           teacherRepository.save(newTeacher);
       }
    }

    public void delete(Teacher teacher){
         teacherRepository.delete(teacher);
    }
}
