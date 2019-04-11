package com.example.A2.Business;


import com.example.A2.Persistence.Entity.Course;
import com.example.A2.Persistence.Repo.CourseRepository;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;

@Service
public class CourseService {
    @Inject
    CourseRepository courseRepository;


    public List<Course> getAllCourses()
    {
        return courseRepository.findAll();
    }


    public List<Course> getAllCoursesByTeacherId(Integer id)
    {
        List<Course> coursesFilteredList = null;

        if (id == 0)
        {
            coursesFilteredList = courseRepository.findAll();
        }
        else
        {
            coursesFilteredList = courseRepository.findAllByTeacherId(id);
        }

        return coursesFilteredList;
    }
}
