package com.example.A2.Controller;


import com.example.A2.Business.CourseService;
import com.example.A2.Persistence.Entity.Course;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.inject.Inject;
import java.util.List;

@Controller
public class CourseController {

    @Inject
    private CourseService courseService;

    @RequestMapping(value =  "/course", method = RequestMethod.GET)
    public ModelAndView getCourses(@RequestParam(name = "fn", required = false) String firstName)
    {
        List<Course> courseList = courseService.getAllCoursesByTeacherFirstName(firstName);

        ModelAndView mav = new ModelAndView("course_view");
        mav.addObject("courseWithTeachersList", courseList);

        return mav;
    }

}
