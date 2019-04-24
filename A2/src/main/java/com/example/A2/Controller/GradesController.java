package com.example.A2.Controller;

import com.example.A2.Business.GradesService;
import com.example.A2.Persistence.Entity.Grades;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.inject.Inject;
import java.util.List;

@Controller
public class GradesController {
    @Inject
    GradesService gradesService;

    @RequestMapping(value = "/grades", method = RequestMethod.GET)
    public ModelAndView getGrades()
    {
        List<Grades> gradesList = gradesService.getAllStudentsGrades();

        ModelAndView mav = new ModelAndView("grades_view");
        mav.addObject("gradesList", gradesList);
        mav.addObject("newGrades", new Grades());

        return mav;
    }

    @RequestMapping(value = "/grades", method = RequestMethod.POST)
    public ModelAndView postGrades(@RequestParam(value = "action") String action, @ModelAttribute(value = "newGrades") Grades newGrade)
    {
        if(action.equals("Add Grade"))
            gradesService.create(newGrade);
        else if(action.equals("Delete Grade"))
            gradesService.delete(newGrade);
        return new ModelAndView("redirect:grades");
    }
}
