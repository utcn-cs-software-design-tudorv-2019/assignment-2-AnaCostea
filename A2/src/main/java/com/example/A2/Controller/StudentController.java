package com.example.A2.Controller;

import com.example.A2.Business.StudentService;
import com.example.A2.Persistence.Entity.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.inject.Inject;
import java.util.List;

@Controller
public class StudentController {
    @Inject
    StudentService studentService;

    @RequestMapping(value = "/student", method = RequestMethod.GET)
    public ModelAndView getStudents()
    {
        List<Student> studentList = studentService.getAllStudentssWithCourses();

        ModelAndView mav = new ModelAndView("student_view");
        mav.addObject("studentsWithCoursesList", studentList);

        return mav;

    }


    @RequestMapping(value = "/student", method = RequestMethod.POST)
    public ModelAndView postStudent(@RequestParam(value = "action") String action,@ModelAttribute(value = "newStudent") Student newStudent)
    {
        if(action.equals("Add Student"))
            studentService.create(newStudent);
        else if(action.equals("Update Student"))
            studentService.update(new Student(), newStudent);
        else
            studentService.delete(newStudent);
        return new ModelAndView("redirect:student");
    }
/*
    @RequestMapping(value = "/student", method = RequestMethod.PUT)
    public ModelAndView updateStudent(@RequestParam(value = "action") String action,@ModelAttribute(value = "newStudent") Student oldStudent)
    {
        if(action.equals("Update Student"))
            studentService.update(new Student(), oldStudent);
        return new ModelAndView("redirect:student");
    }

    @RequestMapping(value = "/student", method = RequestMethod.DELETE)
    public ModelAndView deleteStudent(@RequestParam(value = "action") String action, @ModelAttribute(value = "newStudent") Student newStudent){
        if(action.equals("Delete Student"))
            studentService.delete(newStudent);
        return new ModelAndView("redirect : student");
    }
 */
}
