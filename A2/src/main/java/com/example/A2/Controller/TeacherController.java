package com.example.A2.Controller;

import com.example.A2.Business.TeacherService;
import com.example.A2.Persistence.Entity.Teacher;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.inject.Inject;
import java.util.List;

@Controller
public class TeacherController {
    @Inject
    TeacherService teacherService;

    @RequestMapping(value = "/teacher", method = RequestMethod.GET)
    public ModelAndView getTeachers()
    {
        List<Teacher> teacherList = teacherService.getAllTeachersWithCourses();

        ModelAndView mav = new ModelAndView("teacher_view");
        mav.addObject("teachersWithCoursesList", teacherList);

        return mav;

    }


   /* @RequestMapping(value = "/teacher", method = RequestMethod.POST)
    public ModelAndView postTeacher(@ModelAttribute(value = "newTeacher") Teacher newTeacher)
    {
        teacherService.create(newTeacher);

        //ModelAndView mav = new ModelAndView("redirect : teacher");
        return new ModelAndView("teacher_view");
       // mav.addObject("teacher_view",newTeacher);
       // return mav;

    }

    @RequestMapping(value = "/teacher", method = RequestMethod.DELETE)
    public ModelAndView deleteTeacher(@ModelAttribute(value = "newTeacher") Teacher newTeacher){
        teacherService.delete(newTeacher);
        return new ModelAndView("redirect : teacher");
    }
*/
   @RequestMapping(value = "/teacher", method = RequestMethod.POST)
   public ModelAndView postTeacher(@RequestParam(value = "action") String action, @ModelAttribute(value = "newTeacher") Teacher newTeacher)
   {
       if(action.equals("Create Teacher"))
           teacherService.create(newTeacher);
       else if(action.equals("Update Teacher"))
           teacherService.update(new Teacher(), newTeacher);
       else if(action.equals("Delete Teacher"))
           teacherService.delete(newTeacher);
       return new ModelAndView("redirect:teacher");
   }

}
