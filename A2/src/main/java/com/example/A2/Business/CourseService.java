package com.example.A2.Business;


import com.example.A2.Persistence.Entity.Course;
import com.example.A2.Persistence.Repo.CourseRepository;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

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


    public List<Course> getAllCoursesByTeacherFirstName(String firstName)
    {
        List<Course> coursesFilteredList = null;

        if (StringUtils.isEmpty(firstName))
        {
            coursesFilteredList = courseRepository.findAll();
        }
        else
        {
            coursesFilteredList = courseRepository.findAllByTeacherFirstName(firstName);
        }

        return coursesFilteredList;
    }

    public Course create(Course newCourse){
        return courseRepository.save(newCourse);
    }
}
