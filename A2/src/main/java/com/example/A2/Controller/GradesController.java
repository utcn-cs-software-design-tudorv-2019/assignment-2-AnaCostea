package com.example.A2.Controller;

import com.example.A2.Business.GradesService;
import com.example.A2.Persistence.Entity.Grades;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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

        return mav;

    }
}
